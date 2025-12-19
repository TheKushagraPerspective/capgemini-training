package Day2.Questions;

public class CheckAlphbetOrNot {
    public static void main(String[] args) {
        char ch = '$';

        String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? "Alphabet" : "Not a Aplhabet";
        System.out.println(result);
    }
}
