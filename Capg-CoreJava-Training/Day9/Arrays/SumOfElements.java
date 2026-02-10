package Day9.Arrays;


public class SumOfElements {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};
        int sumOfElements = 0;


        for(int i=0 ; i<arr.length ; i++) {
            sumOfElements += arr[i];
        }

        System.out.println("Sum of All ELements of the array: " + sumOfElements);
    }
}