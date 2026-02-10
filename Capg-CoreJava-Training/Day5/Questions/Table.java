package Day5.Questions;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print the table of it");
        System.out.print("num: ");
        int num = sc.nextInt();
        
        for(int i=1 ; i<=10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
