package Day5.Questions;

public class EvenAlphabet {
    public static void main(String[] args) {
        System.out.println("All Even Alphabets from A to Z");

        for(char ch='A' ; ch<='Z' ; ch++) {
            if(ch % 2 == 0) {
                System.out.println(ch);
            }
        }
    }
}
