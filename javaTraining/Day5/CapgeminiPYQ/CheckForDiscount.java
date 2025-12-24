package Day5.CapgeminiPYQ;

import java.util.Scanner;

public class CheckForDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of units a customer has purchased: ");
        int quantity = sc.nextInt();

        System.out.print("Enter cost of one unit: ");
        double cost = sc.nextDouble();

        double finalCost = quantity * cost;

        if(finalCost >= 1000) {
            finalCost = (finalCost * 0.9);
            System.out.println("Discount of 10% is applicable and Final Amount that user will pay is: " + finalCost);
        }
        else {
            System.out.println("Discount of 10% is not applicable so Final Amount that user will pay is: " + finalCost);
        }

        

        sc.close();
    }
}
