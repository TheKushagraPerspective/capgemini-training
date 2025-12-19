package Day2.Questions;

public class CheckAgeIsValidOrNot {
    public static void main(String[] args) {
        int age = 17;
        int ageLimit = 21;

        String result = (age >= ageLimit) ? "Valid Age" : "Invalid Age";
        System.out.println(result);
    }
}
