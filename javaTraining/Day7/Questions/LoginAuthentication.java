package Day7.Questions;

import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.println(authentication(username , password));

        
        sc.close();
    }


    public static String authentication(String username , String password) {
        String preDefinedUsername = "Kushagra Varshney";
        String preDefinedPassword = "******";
        boolean isAccountExist = true;
        boolean isAccountActive = false;

        if((preDefinedUsername.equals(username) && preDefinedPassword.equals(password)) && isAccountExist && isAccountActive) {
            return "Status Code: 202\nAuthentication Successful. User is able to login into my system.";
        }
        else if(!preDefinedUsername.equals(username) || !preDefinedPassword.equals(password)){
            return "Status Code: 400\nAuthentication Failed. Username or Password is wrong.";
        }
        else if(!isAccountExist) {
            return "Status Code: 401\nAuthentication Failed. User does not exist.";
        }
        else if(isAccountExist && !isAccountActive) {
            return "Status Code: 403\nAuthentication Failed. User exists but not allowed to login into my system.";
        }
        else {
            return "Status Code: 500\nAuthentication Failed. Server Error.";
        }
    }
}
