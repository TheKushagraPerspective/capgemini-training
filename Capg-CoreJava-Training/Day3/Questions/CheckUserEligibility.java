package Day3.Questions;

public class CheckUserEligibility {
    public static void main(String[] args) {
        int userAge = 18;
        boolean userBanned = false;

        boolean cond = (userAge >= 18 && !userBanned);

        String result = cond ? "Can access an application" : "Can't access the appication";

        System.out.println(result);
    }
}
