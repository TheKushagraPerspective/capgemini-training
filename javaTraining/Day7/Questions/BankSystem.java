package Day7.Questions;

import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our Bank.");

        do {

            System.out.println("Please select one of the given option to perform some operation");
            System.out.println("Available Options\nEnter 1 -> Withdrawl\nEnter 2 -> Deposit\nEnter 3 -> Display\nEnter 4 -> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 : {
                    System.out.println("- - - - - - - User wants to perform Withdrawl Operation - - - - - - -");
                    System.out.print("Enter the account balance of the user: ");
                    int accBalance = sc.nextInt();

                    System.out.print("Enter the amount that user wants to withdraw: ");
                    int withdrawAmount = sc.nextInt();

                    if(withdrawl(accBalance , withdrawAmount)) {
                        System.out.println("Withdrawl Successful");
                        System.out.println("Updated Balance: " + (accBalance  - withdrawAmount));
                    }
                    else {
                        System.out.println("Can't able to do withdrawl Operation.\nError can be either Insufficient Balance OR Invalid withdrawl entered.");
                    }
                } break;

                case 2 : {
                    System.out.println("- - - - - - - User wants to perform Deposit Operation - - - - - - -");
                    System.out.print("Enter the account balance of the user: ");
                    int accBalance = sc.nextInt();

                    System.out.print("Enter the amount that user wants to deposit: ");
                    int depositAmount = sc.nextInt();

                    if(deposit(accBalance , depositAmount)) {
                        System.out.println("Deposit Successful");
                        System.out.println("Updated Balance: " + (accBalance  + depositAmount));
                    }
                    else {
                        System.out.println("Can't able to do Deposit Operation.\nError can be either deposit amount shoule be greater than 0 OR Invalid deposit entered.");
                    }
                } break;

                case 3 : {
                    System.out.println("- - - - - - - User wants to perform Display Operation - - - - - - -");

                    sc.nextLine();
                    System.out.print("Enter the Bank Name of the user: ");
                    String bankName = sc.nextLine();

                    System.out.print("Enter the Account holder Name: ");
                    String holderName = sc.nextLine();


                    System.out.print("Enter the account number of the user: ");
                    long accNumber = sc.nextLong();

                    System.out.print("Enter the account balance of the user: ");
                    int accBalance = sc.nextInt();


                    displayDetails(bankName , holderName , accNumber , accBalance);
                } break;

                case 4 : {
                    sc.close();
                    System.exit(0);
                } break;

                default : {
                    System.out.println("Invalid choice of options.\nTry Again...");
                }
            }

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        } while(true);


        
    }


    public static boolean withdrawl(int accBalance , int withAmount) {
        return withAmount > 0 && accBalance >= withAmount;
    }

    public static boolean deposit(int accBalance , int depAmount) {
        return depAmount > 0;
    }

    public static void displayDetails(String bankName , String holderName , long accNumber , int accBalance) {
        System.out.println("User has an account in " + bankName + " Bank\nAccount Holder name of this account is " + holderName + "\nAccount Number : " + accNumber + "\nAvailable balance in the account : " + accBalance);
    }
}