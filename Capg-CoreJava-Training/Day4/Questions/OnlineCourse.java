package Day4.Questions;

import java.util.Scanner;

public class OnlineCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Has student brought the course: (yes/no) ");
        String paid = sc.nextLine();

        System.out.print("Is student opt for Scholarship: (yes/no) ");
        String scholarship = sc.nextLine();

        System.out.println("Is course remains Active or Expired: (active/expire) ");
        String courseStatus = sc.nextLine();

        if(courseStatus.equals("active")) {
            if(paid.equals("yes")) {
                System.out.println("Student is opted for the course and has paid the amount");
            }
            else if(scholarship.equals("yes")) {
                System.out.println("Student is opted for course through scholarship");
            }
        }
        else {
            System.out.println("Course is expired and now student can'b be able to have this");
        }

        sc.close();
    }
}
