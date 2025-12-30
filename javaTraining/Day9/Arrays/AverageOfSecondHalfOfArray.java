package Day9.Arrays;


public class AverageOfSecondHalfOfArray {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,4,7,6};
        int start = 0;
        int end = arr.length - 1;
        int StartIndexOfSecondHalf = arr.length - (start + ((end - start) / 2));
        int sumOfSecondHalfElements = 0;
        int countOfSecondHalfElements = 0;


        for(int i=StartIndexOfSecondHalf ; i<arr.length ; i++) {
            countOfSecondHalfElements++;
            sumOfSecondHalfElements += arr[i];
        }

        double AvgOfSecondHalfElements = ((double)sumOfSecondHalfElements / countOfSecondHalfElements);
        System.out.printf("Average of First Half Elements of the array: %.2f" , AvgOfSecondHalfElements);
    }
}