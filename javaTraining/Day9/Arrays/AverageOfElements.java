package Day9.Arrays;


public class AverageOfElements {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};
        int sumOfElements = 0;


        for(int i=0 ; i<arr.length ; i++) {
            sumOfElements += arr[i];
        }

        double avgOfElements = sumOfElements / arr.length;

        System.out.println("Average of All ELements of the array: " + avgOfElements);
    }
}