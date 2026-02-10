package Day14.Question;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
	
	static Scanner sc = new Scanner(System.in);
	
	public static StringBuilder document = new StringBuilder();
	public static Stack<String> undoStack = new Stack<>();
	public static Stack<String> redoStack = new Stack<>();
	
	public TextEditor() {
		document = new StringBuilder();
		undoStack = new Stack<>();
		redoStack = new Stack<>();
	}
	
	
	private static void saveStateForUndo() {
		undoStack.push(document.toString());
	}

	
	public static void addText(String text) {
		if(document != null) {
			saveStateForUndo();
		}
		
		redoStack.clear();
		document.append(text);
		System.out.println("Text added successfully!\n");
	}
	
	
	public static void deleteText(int noOfChar) {
		int documentLength = document.length();
		int startToDelete = documentLength - noOfChar;
		
		if(document != null && documentLength >= noOfChar) {
			saveStateForUndo();
		}
		
		if(documentLength >= noOfChar) {
			redoStack.clear();
			document.delete(startToDelete, documentLength);
			System.out.println("Text deleted successfully!\n");
		}
	}
	
	
	public static void searchWord(String word) {
		int index = document.indexOf(word);
		
		if(index != -1) {
			System.out.println("Word " + word + " found at " + index + " index");
		}
		else {
			System.out.println("Word " + word + " not found");
		}
	}
	
	
	public static void replaceWord(String oldWord , String newWord) {
		if(document != null) {
			saveStateForUndo();
		}
		
		redoStack.clear();
		String result = document.toString().replaceAll(oldWord , newWord);
		document.setLength(0);
		document = new StringBuilder(result);
		System.out.println("Text replaced successfully!\n");
	}
	
	
	public static void undo() {
		if(!undoStack.empty()) {
			redoStack.push(document.toString());
			document = new StringBuilder(undoStack.pop());
			System.out.println("Undo successful!\n");
		}
		else {
			System.out.println("Nothing to Undo!\n");
		}
	}
	
	
	public static void redo() {
		if(!redoStack.empty()) {
			undoStack.push(document.toString());
			document = new StringBuilder(redoStack.pop());
			System.out.println("Redo successful!\n");
		}
		else { 
			System.out.println("Nothing to Redo!\n");
		}
	}
	
	
	public static void display() {
		System.out.println("Current Document:\n" + document + "\n");
	}
	
	
	public static void main(String[] args) {
		
		boolean needExit = false;
		System.out.println("=== MINI TEXT EDITOR ===");
		System.out.println("1. Add Text\n2. Delete Text\n3. Search Word\n4. Replace Word\n5. Undo\n6. Redo\n7. Display Document\n8. Exit");
		
		do {
			
			System.out.print("Choose: ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : {
					System.out.print("Enter text: ");
					sc.nextLine();
					String text = sc.nextLine();
					
					addText(text);
				}
				break;
				
				case 2 : {
					System.out.print("Enter number of characters to delete: ");
					int noOfChar = sc.nextInt();
					
					deleteText(noOfChar);
				}
				break;
				
				case 3 : {
					System.out.print("Enter word to search: ");
					sc.nextLine();
					String word = sc.nextLine();
					
					searchWord(word);
				}
				break;
				
				case 4 : {
					System.out.print("Enter word to replace: ");
					sc.nextLine();
					String oldWord = sc.nextLine();
					
					System.out.print("Enter replacement: ");
					String newWord = sc.nextLine();
					
					replaceWord(oldWord , newWord);
				}
				break;
				
				case 5 : {
					undo();
				}
				break;
				
				case 6 : {
					redo();
				}
				break;
				
				case 7 : {
					display();
				}
				break;
				
				case 8 : {
					System.out.println("Exiting editor...");
					needExit = true;
				}
				break;
				
				default : {
					System.out.println("Invalid choice...");
				}
			}
			
		} while(!needExit);

	}

}
