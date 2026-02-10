package Day6.Practice;

public class UserDetails {
    public static void main(String[] args) {
        String result = userDetails();

        System.out.println("User Details: " + result);
    }

    public static String  userDetails() {
        String name = "Kushagra Varshney";
        int age = 22;
        String concatResult = "Name: " + name + " and Age: " + age;

        return concatResult;
    }
}
