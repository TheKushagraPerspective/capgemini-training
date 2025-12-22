package Day2.Questions;

public class ValidateCharacter {
    public static void main(String[] args) {
        char ch = 'p';

        boolean UC = (ch >= 'A' && ch <= 'Z');
        boolean LC = (ch >= 'a' && ch <= 'z');
        boolean alp = UC || LC;
        boolean digit = (ch >= '0' && ch <= '9');
        boolean UCV = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
        boolean LCV = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');

        // String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        // ? ((ch >= 'a' && ch <= 'z'
        // ? (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ? "Lowercase Vowel" :
        // "Lowercase Consonent")
        // : (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ? "Uppercase Vowel" :
        // "Uppercase Consonent")))
        // : (ch >= '0' && ch <= '9' ? "Number" : "Special Character");

        String result = alp ? "Alphabet : "
                + (UC ? "UpperCase : " + (UCV ? "Vowel" : "Consonant") : "LowerCase : " + (LCV ? "Vowel" : "Consonant"))
                : (digit ? "Digit" : "Special Character");

        System.out.println("Given Character is a " + result);
    }
}
