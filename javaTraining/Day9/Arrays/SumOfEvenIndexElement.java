package Day9.Arrays;


public class SumOfEvenIndexElement {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};
        int sumOfEven = 0;


        
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 == 0) {    
                sumOfEven += arr[i];
            }
        }

        System.out.println("Sum of All Even Index ELements of the array: " + sumOfEven);
    }
}