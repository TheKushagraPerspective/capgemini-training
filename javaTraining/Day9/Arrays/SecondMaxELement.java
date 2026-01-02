package Day9.Arrays;

public class SecondMaxELement {
    public static void main(String[] args) {
        int arr[] = new int[]{65,351,53,321,165,11};

        int maxElement = -1;
        int maxElement2 = -1;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] >= maxElement) {
                maxElement2 = maxElement;
                maxElement = arr[i];
            }
            else if(arr[i] > maxElement2) {
                maxElement2 = arr[i];
            }
        }

        System.out.println("Max Element in the array is: " + maxElement);
        System.out.println("Second Max Element in the array is: " + maxElement2);
    }
}
