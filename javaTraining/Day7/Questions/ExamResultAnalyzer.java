package Day7.Questions;

import java.util.Scanner;

public class ExamResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of all subjects out of 100 to analyze the result");

        System.out.print("Enter Java marks: ");
        double java = sc.nextDouble();

        System.out.print("Enter Sql marks: ");
        double sql = sc.nextDouble();

        System.out.print("Enter Advance Java marks: ");
        double advanceJava = sc.nextDouble();

        System.out.print("Enter Frontend marks: ");
        double frontend = sc.nextDouble();

        System.out.println(eligibilityChecking(java , sql , advanceJava , frontend));

        sc.close();
    }


    public static String eligibilityChecking(double java , double sql , double advanceJava , double frontend) {
        double sumOfMarks = java + sql + advanceJava + frontend;
        double totalMarks = 4 * 100.0;

        double avgMarks = (sumOfMarks / totalMarks) * 100;

        if(avgMarks >= 91) {
            return "Grade: O\nEligible for PLacement drives";
        }
        else if(avgMarks >= 81) {
            return "Grade: A+\nEligible for PLacement drives";
        }
        else if(avgMarks >= 71) {
            return "Grade: A\nEligible for PLacement drives";
        }
        else if(avgMarks >= 61) {
            return "Grade: B+\nEligible for PLacement drives";
        }
        else if(avgMarks >= 51) {
            return "Grade: B\nEligible for PLacement drives";
        }
        else if(avgMarks >= 41) {
            return "Grade: C\nEligible for PLacement drives";
        }
        else {
            return "Grade: F\nNot Eligible for PLacement drives";
        }
    }
}
