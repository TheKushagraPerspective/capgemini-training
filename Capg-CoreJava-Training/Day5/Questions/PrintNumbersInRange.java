package Day5.Questions;

import java.util.Scanner;

public class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to print all the numbers except the number which has 7 in it");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();


        System.out.print("These are the numbers which doesn't have 7 in it: ");
        for(int i=m ; i<=n ; i++) {
            int temp = i;
            boolean sevenFound = false;
            while(temp > 0) {
                int lastDigit = temp % 10;
                if(lastDigit == 7) {
                    sevenFound = true;
                    break;
                }
                temp /= 10;
            }

            if(!sevenFound) System.out.print(i + " ");
        }

        

        sc.close();
    }
}
