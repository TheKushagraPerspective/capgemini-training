package Day5.Questions;

import java.util.Scanner;

public class NumberToAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to convert into alphabet: (Range: 1 to 26) ");
        int num = sc.nextInt();

        if(num >= 1 && num <= 26) {
            num += 64;
            char result = (char)num;
            System.out.println(result);
        }
        else {
            System.out.println("Invalid input, not in expected range");
        }
        

        sc.close();
    }
}
