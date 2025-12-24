package Day5.Questions;

import java.util.Scanner;

public class ProdOfEvenAndOddInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find product of all even and odd numbers btw them");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();

        long evenProd = 1;
        long oddProd = 1;
        
        for(int i=m ; i<=n ; i++) {
            if(i % 2 == 0) {
                evenProd *= i;
            }
            else {
                oddProd *= i;
            }
        }

        System.out.println("Product of all even numbers btw " + m + " and " + n + " is " + evenProd);
        System.out.println("Product of all odd numbers btw " + m + " and " + n + " is " + oddProd);


        sc.close();
    }
}
