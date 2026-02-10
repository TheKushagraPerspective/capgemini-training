package Day2.Questions;

import java.util.Scanner;

public class CheckDigitOrNot {
    public static void main(String[] args) {
        // Q1. Check given character is a digit or not
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        boolean result = (ch >= '0' && ch <= '9');
        System.out.println("Digit : " + result);

        sc.close();
    }
}
