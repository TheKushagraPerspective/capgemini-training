package Day4.Questions;

import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Grades to evaluate");
        System.out.println("O Grade\nA Grade\nB Grade\nC Grade\nD Grade\nE Grade\nF Grade");
        System.out.print("Enter a grade to evaluate its equavalent value in acedemic scode: ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'O' : {
                System.out.println("User wants to evaluate Grade - O");
                System.out.println("The equivalent value in acedemic scode for the given grade O is 10");
            } break ;

            case 'A' : {
                System.out.println("User wants to evaluate Grade - A");
                System.out.println("The equivalent value in acedemic scode for the given grade A is 9");
            } break ;

            case 'B' : {
                System.out.println("User wants to evaluate Grade - B");
                System.out.println("The equivalent value in acedemic scode for the given grade B is 8");
            } break ;

            case 'C' : {
                System.out.println("User wants to evaluate Grade - C");
                System.out.println("The equivalent value in acedemic scode for the given grade C is 7");
            } break ;

            case 'D' : {
                System.out.println("User wants to evaluate Grade - D");
                System.out.println("The equivalent value in acedemic scode for the given grade D is 6");
            } break ;

            case 'E' : {
                System.out.println("User wants to evaluate Grade - E");
                System.out.println("The equivalent value in acedemic scode for the given grade E is 5");
            } break ;

            case 'F' : {
                System.out.println("User wants to evaluate Grade - F");
                System.out.println("The equivalent value in acedemic scode for the given grade E is 4 and student will be considered as failed");
            } break ;

            default : {
                System.out.println("Invalid selection of grade");
            }
        }


        sc.close();
    }
}
