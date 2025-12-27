package Day7.Questions;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the customer type: (Regular / Premium) ");
        String customerType = sc.nextLine();

        double finalPayableAmount = calculateAmount(amount , customerType);

        System.out.println("The customer has to pay " + finalPayableAmount + " rupees after applying the discount");
        
        sc.close();

    }


    public static double calculateAmount(double amount , String customerType) {
        double discountForPremium = Math.round((0.5 + Math.random() * (0.7 - 0.5)) * 100.0) / 100.0;
        double discountForRegular = Math.round((0.1 + Math.random() * (0.2 - 0.1)) * 100.0) / 100.0;
        double finalAmount = 0.0;

        if(customerType.equals("Premium")) {
            System.out.println(discountForPremium * 100 + "% discount will be applicable on purchase amount for this customer");
            finalAmount = Math.round((amount * (1 - discountForPremium)) * 100.0) / 100.0;
        }
        else {
            System.out.println(discountForRegular * 100 + "% discount will be applicable on purchase amount for this customer");
            finalAmount = Math.round((amount * (1 - discountForRegular)) * 100.0) / 100.0;
        }

        return finalAmount;
    }
}
