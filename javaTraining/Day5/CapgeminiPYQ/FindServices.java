package Day5.CapgeminiPYQ;

import java.util.Scanner;

public class FindServices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender: (M -> for male / F -> for female) ");
        char gender = sc.next().charAt(0);

        if(gender == 'F' || (gender == 'M' && age >= 40 && age <= 60)) {
            System.out.println("The Employee will work in urban areas only");
        }
        else if(gender == 'M' && age >= 20 && age <= 40) {
            System.out.println("He can work in any areas");
        }
        else {
            System.out.println("- - - - - -  ERROR  - - - - - -");
            System.out.println("Invalid age or gender");
        }

        sc.close();
    }
}
