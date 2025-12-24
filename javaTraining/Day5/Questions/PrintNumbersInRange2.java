package Day5.Questions;

import java.util.Scanner;

public class PrintNumbersInRange2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to print all the numbers which has 5 in it");
        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("n: ");
        int n = sc.nextInt();


        System.out.print("These are the numbers has 5 in it: ");
        for(int i=m ; i<=n ; i++) {
            int temp = i;
            boolean fiveFound = false;
            while(temp > 0) {
                int lastDigit = temp % 10;
                if(lastDigit == 5) {
                    fiveFound = true;
                    break;
                }
                temp /= 10;
            }

            if(fiveFound) System.out.print(i + " ");
        }

        

        sc.close();
    }
}
