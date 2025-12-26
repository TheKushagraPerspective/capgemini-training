package Day6.Questions;

import java.util.Scanner;

public class Area {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        char wantToExecute;

        do {

            System.out.println("Choose one out of following shape to calculate the area");
            System.out.println("Enter 1 -> for Square Area\nEnter 2 -> for Rectangle Area\nEnter 3 -> for Circle Area");
            System.out.print("Enter your option: ");
            int key = sc.nextInt();
            
            switch (key) {
                case 1 : {
                    double result = squareArea();
                    System.out.printf("The Area of the Square: %.2f" , result);
                    System.out.println();
                } break;

                case 2 : {
                    double result = rectangleArea();
                    System.out.printf("The Area of the Rectangle: %.2f" , result);
                    System.out.println();
                } break;

                case 3 : {
                    double result = circleArea();
                    System.out.printf("The Area of the Circle: %.2f" , result);
                    System.out.println();
                } break;

                default : {
                    System.out.println("Invalid choice from available options");
                }
            }

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Want to calculate the area again then write 'y' otherwise 'n' : ");
            wantToExecute = sc.next().charAt(0);

        } while(wantToExecute == 'y');

        sc.close();
    }


    public static double squareArea() {
        System.out.println("You have choosen Square to find the area");
        System.out.println("Enter the side of the square");
        System.out.print("Side: ");
        double side = sc.nextDouble();

        double area = side * side;

        return area;
    }

    public static double rectangleArea() {
        System.out.println("You have choosen Rectangle to find the area");
        System.out.println("Enter the length and breadth of the rectangle");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        return area;
    }

    public static double circleArea() {
        System.out.println("You have choosen Circle to find the area");
        System.out.println("Enter the radius of the circle");
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        double area = 3.14 * (radius * radius);

        return area;
    }


}
