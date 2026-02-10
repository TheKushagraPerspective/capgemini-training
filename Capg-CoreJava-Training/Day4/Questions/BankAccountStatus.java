package Day4.Questions;

import java.util.Scanner;

public class BankAccountStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current balance of the user: ");
        double balance = sc.nextDouble();

        System.out.print("Enter the minimum balance that is required to remain as active user: ");
        double minBalance = sc.nextDouble();

        System.out.print("Enter user's total transaction value for today: ");
        double transactionValue = sc.nextDouble();

        System.out.println("Maximum limit of amount where user can have transaction of on a day: ");
        double maxLimit = sc.nextDouble();

        if(balance >= minBalance) {
            if(transactionValue < maxLimit) {
                System.out.println("User account Status : Active");
            }
            else {
                System.out.println("User account Status: Active and has frozen for today as max limit of transaction has reached");
            }
        }
        else {
            if(transactionValue < maxLimit) {
                System.out.println("User account Status: Low Balance and user needs to deposit some amount to reach abouve minBalance");
            }
            else {
                System.out.println("User account Status: Low Balance and has frozen for today as max limit of transaction has reached");
            }
        }

        sc.close();
    }
}
