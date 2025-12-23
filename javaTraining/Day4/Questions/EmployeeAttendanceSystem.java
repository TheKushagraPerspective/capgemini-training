package Day4.Questions;

import java.util.Scanner;

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the working hours of an employee: ");
        int workingHour = sc.nextInt();

        if(workingHour > 8) {
            System.out.println("Employee will be marked present");
        }
        else if(workingHour >= 4 && workingHour <= 8) {
            System.out.println("Employee will be marked Half-Day present");
        }
        else {
            System.out.println("Employee will be marked absent");
        }

        sc.close();
    }
}
