package Day3.Questions;

public class CheckLogin {
    public static void main(String[] args) {
        String username = "" , password = "#$djn";
        boolean isAccountActive = true;

        boolean credentials = (username != "" && password != "");

        String result = (credentials && isAccountActive ? "Can Login" : "Can't Login");

        System.out.println(result);
    }
}
