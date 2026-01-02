package Day9.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,5,8,9};

        int minElement = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        System.out.println("Min Element in the array is: " + minElement);
    }
}
