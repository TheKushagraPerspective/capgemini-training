package Day8.Questions;


public class CheckHappyNumber {
    public static void main(String[] args) {
        System.out.println("Program is to find all happy numbers from 7 to 500");

        int left = 7;
        int right = 500;
        int count = 0;

        System.out.print("All Happy Numbers btw 7 to 500: ");
        for(int i=left ; i<=right ; i++) {
            int num = i;
            int reducedNum = 0;
            while(num > 0) {
                int lastDigit = num % 10;
                num /= 10;
                reducedNum += (lastDigit * lastDigit);

                if(num == 0 && reducedNum >= 10) {
                    num = reducedNum;
                    reducedNum = 0;
                }
            }

            if(reducedNum == 1) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total happy number btw 7 to 500: " + count);
    }
}