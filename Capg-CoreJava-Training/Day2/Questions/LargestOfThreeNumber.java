package Day2.Questions;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 10000, num2 = 2000, num3 = 5000;

        // int result = ((num1 >= num2) ? num1 : num2) >= num3 ?  : num3;
        int result = (num1 >= num2 && num1 >= num3) ? num1 : ((num2 >= num3) ? num2 : num3);
        System.out.println("Largest Number: " + result);
    }
}
