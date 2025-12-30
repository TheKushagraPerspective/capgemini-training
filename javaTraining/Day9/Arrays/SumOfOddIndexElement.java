package Day9.Arrays;


public class SumOfOddIndexElement {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};
        int sumOfOdd = 0;


        
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 != 0) {    
                sumOfOdd += arr[i];
            }
        }

        System.out.println("Sum of All Odd Index ELements of the array: " + sumOfOdd);
    }
}