package Day5.Questions;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find count of numbers which are divisible by 7 btw them");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();

        int count = 0;

        for(int i=m ; i<=n ; i++) {
            if(i % 7 == 0) {
                count++;
            }
        }

        System.out.println("There are total " + count + " numbers in the range of " + m + " and " + n + " which are divisible by 7");
        System.out.print("These are the numbers: ");
        for(int i=m ; i<=n ; i++) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
