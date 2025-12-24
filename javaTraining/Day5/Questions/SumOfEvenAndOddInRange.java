package Day5.Questions;

import java.util.Scanner;

public class SumOfEvenAndOddInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find sum of all even and odd numbers btw them");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=m ; i<=n ; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }

        System.out.println("Sum of all even numbers btw " + m + " and " + n + " is " + evenSum);
        System.out.println("Sum of all odd numbers btw " + m + " and " + n + " is " + oddSum);


        sc.close();
    }
}
