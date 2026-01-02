package Day9.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,5,8,9};

        int maxElement = -1;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        System.out.println("Max Element in the array is: " + maxElement);
    }
}
