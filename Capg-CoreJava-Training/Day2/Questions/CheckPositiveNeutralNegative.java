package Day2.Questions;

public class CheckPositiveNeutralNegative {
    public static void main(String[] args) {
        int num = 0;

        String result = (num > 0) ? "Positive Number" : (num < 0 ? "Negative Number" : "Neutral Number");
        System.out.println(result);
    }   
}
