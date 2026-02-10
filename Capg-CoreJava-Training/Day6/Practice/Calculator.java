package Day6.Practice;

import java.util.Scanner;

public class Calculator {

    
    public static void main(String[] args) {
        char operator = '*';

        if(operator == '+') {
            System.out.println("User want addition operation");
            addition();
        }
        else if(operator == '-') {
            System.out.println("User want subtraction operation");
            subtraction();
        }
        else if(operator == '*') {
            System.out.println("User want multiplication operation");
            multiplication();
        }
        else {
            System.out.println("Invalid operator used");
        }
        // addition();
        // subtraction();
    }

    public static void addition() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b to perform addition");
        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));

        sc.close();
    }

    public static void subtraction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b to perform subtraction");
        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));

        sc.close();
    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b to perform multiplication");
        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        
        sc.close();
        
    }
}
