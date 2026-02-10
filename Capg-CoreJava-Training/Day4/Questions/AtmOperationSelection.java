package Day4.Questions;

import java.util.Scanner;

public class AtmOperationSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long balance = 100000l;


        System.out.println("Available operations selection for ATM");
        System.out.println("Key -> 1 for Withdraw\nKey -> 2 for Deposit\nKey -> 3 for Balance Enquiry\nKey -> 4 for Exit");
        System.out.print("Enter a key from the available options: (- - please enter 4 to exit - -) ");
        int key = sc.nextInt();


        while(key != 4) {
            switch (key) {
                case 1 : {
                    System.out.println("User has selected for withdrawl");
                    System.out.print("Enter amount to withdraw the money: ");
                    int withdrawlAmount = sc.nextInt();

                    if(withdrawlAmount > 0 && withdrawlAmount <= balance) {
                        System.out.println("Your withdrawl request has been granted and here is your money");
                        balance -= withdrawlAmount;
                        System.out.println("Your updated balance is : " + balance);
                    }
                    else {
                        if(withdrawlAmount <= 0) {
                            System.out.println("Withdrawl amount should be greater than 0");
                        }
                        else if(withdrawlAmount > balance) {
                            System.out.println("In-Sufficient balance in your account. Please enter a valid amount to withdrawl");
                        }
                        else {
                            System.out.println("User enter a invalid withdrawl amount");
                        }
                    }

                    System.out.println("- - - - - - - - - - - - - - - - -");
                    System.out.println("Available operations selection for ATM");
                    System.out.println("Key -> 1 for Withdraw\nKey -> 2 for Deposit\nKey -> 3 for Balance Enquiry\nKey -> 4 for Exit");
                    System.out.print("Enter a key from the available options: (- - please enter 4 to exit - -) ");
                    key = sc.nextInt();
                } break;

                case 2 : {
                    System.out.println("User has selected for Deposit");
                    System.out.print("Enter amount to deposit the money: ");
                    int depositAmount = sc.nextInt();

                    if(depositAmount > 0) {
                        System.out.println("Your deposit request has been granted and balance has been updated in your account");
                        balance += depositAmount;
                        System.out.println("Your updated balance is : " + balance);
                    }
                    else {
                        if(depositAmount <= 0) {
                            System.out.println("Deposit amount should be greater than 0");
                        }
                        else {
                            System.out.println("User enter a invalid deposit amount");
                        }
                    }

                    System.out.println("- - - - - - - - - - - - - - - - -");
                    System.out.println("Available operations selection for ATM");
                    System.out.println("Key -> 1 for Withdraw\nKey -> 2 for Deposit\nKey -> 3 for Balance Enquiry\nKey -> 4 for Exit");
                    System.out.print("Enter a key from the available options: (- - please enter 4 to exit - -) ");
                    key = sc.nextInt();
                } break;

                case 3 : {
                    System.out.println("User has selected for Balance Enquiry");
                    System.out.println("Currently you have " + balance + " in your bank account.");

                    System.out.println("- - - - - - - - - - - - - - - - -");
                    System.out.println("Available operations selection for ATM");
                    System.out.println("Key -> 1 for Withdraw\nKey -> 2 for Deposit\nKey -> 3 for Balance Enquiry\nKey -> 4 for Exit");
                    System.out.print("Enter a key from the available options: (- - please enter 4 to exit - -) ");
                    key = sc.nextInt();
                } break;

                default : {
                    System.out.println("User has selected a Invalid key that is not in the available option.");

                    System.out.println("- - - - - - - - - - - - - - - - -");
                    System.out.println("Available operations selection for ATM");
                    System.out.println("Key -> 1 for Withdraw\nKey -> 2 for Deposit\nKey -> 3 for Balance Enquiry\nKey -> 4 for Exit");
                    System.out.print("Enter a key from the available options: (- - please enter 4 to exit - -) ");
                    key = sc.nextInt();
                }
            }
        }


        sc.close();
    }   
}
