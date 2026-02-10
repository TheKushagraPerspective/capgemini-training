package Day7.Questions;

import java.util.Scanner;

public class BankTransValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available balance in the account: ");
        double availableBalance = sc.nextDouble();

        System.out.print("Enter amount that you want to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        System.out.println(transactionValidation(availableBalance , withdrawAmount));

        sc.close();
    }


    public static String transactionValidation(double balance , double withdrawAmount) {

        if(withdrawAmount <= 0) {
            return "Please enter a valid or more than 0 to withdraw some amount";
        }
        else if(withdrawAmount > balance) {
            return "Withdrawl amount shoule be always lesser or equal than that available balance.\nTry again later...";
        }
        else {
            double leftAmount = balance - withdrawAmount;
            return "Your transaction has been successfully proceeded and your current balance is now " + leftAmount;
        }
    }
}
