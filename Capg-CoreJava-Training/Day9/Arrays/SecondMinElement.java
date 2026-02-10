package Day9.Arrays;

public class SecondMinElement {
    public static void main(String[] args) {
        int arr[] = new int[]{65,351,53,321,165,11};

        int minElement = Integer.MAX_VALUE;
        int minElement2 = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] <= minElement) {
                minElement2 = minElement;
                minElement = arr[i];
            }
            else if(arr[i] < minElement2) {
                minElement2 = arr[i];
            }
        }

        System.out.println("Min Element in the array is: " + minElement);
        System.out.println("Second Min Element in the array is: " + minElement2);
    }
}
