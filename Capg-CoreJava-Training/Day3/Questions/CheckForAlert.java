package Day3.Questions;

public class CheckForAlert {
    public static void main(String[] args) {
        int loginAttempts = 3;
        boolean accountLocked = false;

        boolean cond = (loginAttempts > 3 && accountLocked);

        String result = cond ? "Should send an alert" : "Can try again to login";

        System.out.println(result);
    }
}
