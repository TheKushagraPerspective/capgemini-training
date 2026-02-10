package Day5.Questions;

import java.util.Scanner;

public class OddNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find all odd numbers btw them");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();


        System.out.print("All Odd numbers btw " + m + " and " + n + " are: ");
        for(int i=m ; i<=n ; i++) {
            if((i & 1) != 0) {
                System.out.print(i + " ");
            }
        }


        sc.close();
    }
}
