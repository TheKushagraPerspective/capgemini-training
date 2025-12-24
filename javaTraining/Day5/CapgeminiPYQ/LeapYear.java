package Day5.CapgeminiPYQ;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Given year is a Leap year");
        }
        else if(year % 400 == 0) {
            System.out.println("Given year is a Leap year");
        }
        else {
            System.out.println("Given year is not a Leap year");
        }

        sc.close();
    }
}
