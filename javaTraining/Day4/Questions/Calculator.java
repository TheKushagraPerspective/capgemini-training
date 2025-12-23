package Day4.Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to perform operations : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("- - - - - - - -    Available Operations that can be applied on operands    - - - - - - - -");
        System.out.println("Key -> 1 for Addition");
        System.out.println("Key -> 2 for Subtraction");
        System.out.println("Key -> 3 for Multiplication");
        System.out.println("Key -> 4 for Division");
        System.out.println("Key -> 5 for Modulus");
        System.out.print("Enter key to perform specific operation: ");
        int key = sc.nextInt();

        switch(key) {
            case 1 : {
                System.out.println("Addition of two numbers " + num1 + " and " + num2 + " is " + (num1 + num2));
            } break;
            case 2 : {
                System.out.println("Subtraction of two numbers " + num1 + " and " + num2 + " is " + (num1 - num2));
            } break;
            case 3 : {
                System.out.println("Multiplication of two numbers " + num1 + " and " + num2 + " is " + (num1 * num2));
            } break;
            case 4 : {
                if(num2 == 0) {
                    boolean denominatorIsZero = true;
                    while(denominatorIsZero) {
                        System.out.println("Denominator can't be equal to 0.");
                        System.out.print("Iy you want to enter the value of denominator again then write yes otherwise no: ");
                        sc.nextLine();
                        String wantAgain = sc.nextLine();
                        if(wantAgain.equals("yes")) {
                            num2 = sc.nextInt();
                            denominatorIsZero = (num2 == 0);
                            if(num2 != 0) {
                                System.out.println("Division of two numbers " + num1 + " and " + num2 + " is " + (num1 / num2));
                            }
                        }
                        else {
                            denominatorIsZero = false;
                        }
                    }
                }
                else {
                    System.out.println("Division of two numbers " + num1 + " and " + num2 + " is " + (num1 / num2));
                }
            } break;
            case 5 : {
                System.out.println("Modulus of two numbers " + num1 + " and " + num2 + " is " + (num1 % num2));
            } break;
            default : {
                System.out.println("User entered invalid key.");
            }
        }

        sc.close();
    }
}
