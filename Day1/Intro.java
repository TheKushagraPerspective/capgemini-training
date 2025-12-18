package Day1;

public class Intro {

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double l , double b) {
        return l*b;
    }

    public static double circleArea(double radius) {
        return 3.14*radius*radius;
    }


    public static void main(String[] args) {
        System.out.print(5 + "  ");
        System.out.print(25 + " ");
        System.out.print(75 + " ");
        System.out.println(85);
        System.out.print(25 + " ");
        System.out.print(45 + " ");
        System.out.println(35);
        System.out.print(15 + " ");
        System.out.println(20);
        System.out.println(5);
        System.out.println(55);
        System.out.print(66 + " ");
        System.out.println(67);


        double side = 4.2;
        System.out.println("Area of square with side " + side + " is " + squareArea(side));

        double length = 3.5;
        double breath = 4;
        System.out.println("Area of rectangle with length " + length + " and breath " + breath + " is " + rectangleArea(length , breath));

        double radius = 5;
        System.out.println("Area of circle with radius " + radius + " is " + circleArea(radius));


        int intdt = 15;
        String stringdt = "LPU";
        boolean booldt = false;
        float floatdt = 13.5f;
        String stringdt2 = "true";
        char chardt = '#';
        String stringdt3 = "123";
        String stringdt4 = "@";

        System.out.println(intdt + " " + stringdt + " " + booldt + " " + floatdt + " " + stringdt2 + " " + chardt + " " + stringdt3 + " " + stringdt4);


        int number1 = 0;
        int number2 = 20;

        System.out.println("before Swap of two number: " + number1 + " and " + number2);

        // int temp = number1;
        // number1 = number2;
        // number2 = temp;

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("after Swap of two number: " + number1 + " and " + number2);
    }
}
