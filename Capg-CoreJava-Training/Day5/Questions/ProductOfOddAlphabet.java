package Day5.Questions;

public class ProductOfOddAlphabet {
    public static void main(String[] args) {
        System.out.println("Product of All Odd Alphabets from A to Z");

        for(char ch='A' ; ch<='Z' ; ch++) {
            if(ch % 2 != 0) {
                System.out.print(ch+" ");
            }
        }
    }
}
