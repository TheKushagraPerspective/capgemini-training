package Meeting.Questions;

public class FindAllVowels {
	
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tempStr = "This is the temporary string";
		
		System.out.println("Here we are all vowels present in given string...");
		for(char ch : tempStr.toCharArray()) {
			if(isVowel(ch)) {
				System.out.print(ch + " ");
			}
		}
		
		
		
		
		String num = "15";
		String num2 = "5";
		int extractedNumber = Integer.parseInt(num);
		int extractedNumber2 = 0;
		for(char ch : num2.toCharArray()) {
			extractedNumber2 = ch - '0';    // we can use this when we have one digit as a string
		}
		
		System.out.println("\nExtracted Number using parse: " + extractedNumber);
		System.out.println("Extracted Number: " + extractedNumber2);
	}

}
