package Day8.Questions;




public class DisariumNumber {
    public static void main(String[] args) {
        System.out.println("Program is to find all disarium numbers from 100 to 999");

        int left = 10;
        int right = 999;
        int count = 0;

        System.out.print("All Disarium Numbers btw 100 to 999: ");
        for(int i=left ; i<=right ; i++) {
            
            int len = 0;
            int num = i;
            // calculating the len of the digit
            while(num > 0) {
                num /= 10;
                len++;
            }

            num = i;
            int formedNum = 0;
            while(num > 0) {
                int lastDigit = num % 10;
                num /= 10;
                int n = len;
                int prod = 1;
                while(n > 0) {
                    prod *= lastDigit;
                    n--;
                }
                formedNum += prod;
                len--;
            }

            if(formedNum == i) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total Disarium Numbers btw 100 to 999: " + count);
    }
}