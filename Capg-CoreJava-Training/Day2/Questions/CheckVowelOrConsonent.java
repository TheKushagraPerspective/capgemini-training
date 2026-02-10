package Day2.Questions;

public class CheckVowelOrConsonent {
    public static void main(String[] args) {
        char ch = '@';

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? "Consonent" : "Not a valid alphabet");
        System.out.println(result);

        
        String lowerCaseVowel = "aeiou";
        String upperCaseVowel = "AEIOU";
        char ch2 = 'b';
        char ch3 = 'I';

        String result2 = (lowerCaseVowel.contains(String.valueOf(ch2))) ? "LowerCase Vowel" : (ch2 >= 97 && ch2 <= 122 ? "Lowercase Consonent" : "Not a valid lowercase alphabet");
        String result3 = (upperCaseVowel.contains(String.valueOf(ch3))) ? "UpperCase Vowel" : (ch3 >= 65 && ch3 <= 90 ? "Uppercase Consonent" : "Not a valid uppercase alphabet");
        System.out.println(result2);
        System.out.println(result3);
    }
}
