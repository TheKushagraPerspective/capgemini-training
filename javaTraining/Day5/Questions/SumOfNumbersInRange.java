package Day5.Questions;


import java.util.Scanner;

public class SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to find sum of all the numbers which are divisible by 5 btw them");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();

        long sum = 0;

        for(int i=m ; i<=n ; i++) {
            if(i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all the numbers in the range of " + m + " and " + n + " which are divisible by 5 is " + sum);
        System.out.print("These are the numbers that are divisible by 5 in given range: ");
        for(int i=m ; i<=n ; i++) {
            if(i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}


