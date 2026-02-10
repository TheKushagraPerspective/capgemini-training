package Day2.Questions;

public class CheckUppercaseOrLowercase {
    public static void main(String[] args) {
        char ch = 'a';

        // String result = (ch >= 65 && ch <= 90) ? "UpperCase" : "Not UpperCase";
        String result = (ch >= 'A' && ch <= 'Z') ? "UpperCase" : ((ch >= 97 && ch <= 122) ? "LowerCase" : "Not aAlphabet");
        System.out.println(result);
    }
}
