package Day9.Arrays;


public class SecondHalfOfArray {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        int startIndexOfSecondHalf = arr.length - (start + ((end - start) / 2));


        System.out.println("All ELements from the second half of the array");
        for(int i=startIndexOfSecondHalf ; i<arr.length ; i++) {
            System.out.println("Element at index " + (i) + " : " + arr[i]);
        }
    }
}