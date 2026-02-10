package Day5.Loops;

public class Intro {
    public static void main(String[] args) {
        int num = 100;
        String reversedNum = "";

        while(num > 0) {
            int lastDigit = num % 10;
            reversedNum += lastDigit;
            num /= 10;
        }

        int result = Integer.parseInt(reversedNum);
        int result2 = Integer.valueOf(reversedNum);
        System.out.println(reversedNum);
        System.out.println(result);
        System.out.println(result2);
        System.out.printf("%03d" , result2);
    }
}
