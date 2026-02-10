package Day17.Practice;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		
		// ------------------------------
        // 1. mkdir()  (single directory)
        // ------------------------------

        // Relative path folder
		File dir1 = new File("SingleFolder");
		if(!dir1.exists()) {
			dir1.mkdir();
			System.out.println("Folder created");
			System.out.println("Folder relative path: " + dir1.getPath());
			System.out.println("Folder absolute path: " + dir1.getAbsolutePath());
			System.out.println("Folder name: " + dir1.getName());
		}
		else {
			System.out.println("Folder already exist");
		}
		
		System.out.println();
		
		// Absolute path folder
		File dir2 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\SingleFolder");
		if(!dir2.exists()) {
			dir2.mkdirs();
			System.out.println("Folder created");
			System.out.println("Folder absolute path: " + dir2.getAbsolutePath());
			System.out.println("Folder name: " + dir2.getName());
		}
		else {
			System.out.println("Folder already exist");
		}
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		// ------------------------------
        // 2. mkdir()  (multiple directory)
        // ------------------------------
		
		// Relative path folder
		File dir3 = new File("Parent\\Child\\SubChild");
		if(!dir3.exists()) {
			dir3.mkdirs();
			System.out.println("Folder created");
			System.out.println("Folder relative path: " + dir3.getPath());
			System.out.println("Folder absolute path: " + dir3.getAbsolutePath());
			System.out.println("Folder name: " + dir3.getName());
		}
		else {
			System.out.println("Folder already exist");
		}
		
		System.out.println();
		
		File dir4 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\Parent\\Child\\SubChild");
		if(!dir4.exists()) {
			dir4.mkdirs();
			System.out.println("Folder created");
			System.out.println("Folder relative path: " + dir4.getPath());
			System.out.println("Folder absolute path: " + dir4.getAbsolutePath());
			System.out.println("Folder name: " + dir4.getName());
		}
		else {
			System.out.println("Folder already exist");
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");
		
		// ------------------------------
        // 2. createNewFile()  
        // ------------------------------
		
//		Relative path file
		File file1 = new File("relativeFile.txt");
		if(file1.createNewFile()) {
			System.out.println("File Created");
			System.out.println("File relative path: " + file1.getPath());
			System.out.println("File absolute path: " + file1.getAbsolutePath());
		}
		else {
			System.out.println("File already exists (relative)");
		}
		
		System.out.println();
		
//		Absolute path file
		File file2 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\SingleFolder\\absoluteFile.txt");
		if(file2.createNewFile()) {
			System.out.println("File Created");
			System.out.println("File relative path: " + file2.getPath());
			System.out.println("File absolute path: " + file2.getAbsolutePath());
		}
		else {
			System.out.println("File already exists (absolute)");
		}
		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		// ------------------------------
        // 4. length()  (file size in bytes)
        // ------------------------------
		
		System.out.println("Size of relativeFile: " + file1.length() + " bytes");
		System.out.println("Size of absoluteFile: " + file2.length() + " bytes");
		
		System.out.println("---------------------------------------------------------------------------------");
		
		
		// ------------------------------
        // 5. renameTo() (rename files)
        // ------------------------------
		
//		relative file 
		File oldName = new File("relativeFile.txt");
		File newName = new File("newRelativeFile.txt");
		
		if(oldName.renameTo(newName)) {
			System.out.println("File renamed successfully");
		}
		else {
			System.out.println("File renamed Failed");
		}
		
		System.out.println();
		
		File oldName2 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\SingleFolder\\absoluteFile.txt");
		File newName2 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\SingleFolder\\newAbsoluteFile.txt");
		
		if(oldName2.renameTo(newName2)) {
			System.out.println("File renamed successfully");
		}
		else {
			System.out.println("File renamed Failed");
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		
		
		// ------------------------------
        // 6. renameTo() (rename folder (single folder)
        // ------------------------------
		
		File oldDir = new File("C:\\Users\\Kushagra Varshney\\Downloads\\SingleFolder");
		File newDir = new File("C:\\Users\\Kushagra Varshney\\Downloads\\NewSingleFolder");
		
		if(oldDir.exists()) {
			if(oldDir.renameTo(newDir)) {
				System.out.println("Directory renamed successfully");
			}
			else {
				System.out.println("Directory renamed failed");
			}
		}
		else {
			System.out.println("Directory does not exist");
		}
		
		System.out.println();
		
		File oldDir2 = new File("SingleFolder");
		File newDir2 = new File("NewSingleFolder");
		
		if(oldDir2.exists()) {
			if(oldDir2.renameTo(newDir2)) {
				System.out.println("Directory renamed successfully");
			}
			else {
				System.out.println("Directory renamed failed");
			}
		}
		else {
			System.out.println("Directory does not exist");
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		
		
		// ------------------------------
        // 6. renameTo() (rename folder (multi folder)
        // ------------------------------
		
		File oldDir3 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\Parent\\Child\\SubChild");
		File newDir3 = new File("C:\\Users\\Kushagra Varshney\\Downloads\\Parent\\Child\\NewSubChild");
		
		if(oldDir3.exists()) {
			if(oldDir3.renameTo(newDir3)) {
				System.out.println("Directory renamed successfully");
			}
			else {
				System.out.println("Directory renamed failed");
			}
		}
		else {
			System.out.println("Directory does not exist");
		}
		
		System.out.println();
		
		
		File oldDir4 = new File("Parent");
		File newDir4 = new File("NewParent");
		
		if(oldDir4.exists()) {
			if(oldDir4.renameTo(newDir4)) {
				System.out.println("Directory renamed successfully");
			}
			else {
				System.out.println("Directory renamed failed");
			}
		}
		else {
			System.out.println("Directory does not exist");
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		
	}

}
