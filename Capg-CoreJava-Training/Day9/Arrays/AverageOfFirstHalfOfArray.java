package Day9.Arrays;


public class AverageOfFirstHalfOfArray {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,4,7,6};
        int start = 0;
        int end = arr.length - 1;
        int lastIndexOfFirstHalf = start + ((end - start) / 2);
        int sumOfFirstHalfElements = 0;
        int countOfFirstHalfElements = lastIndexOfFirstHalf + 1;


        for(int i=0 ; i<=lastIndexOfFirstHalf ; i++) {    
            sumOfFirstHalfElements += arr[i];
        }

        double AvgOfFirstHalfElements = ((double)sumOfFirstHalfElements / countOfFirstHalfElements);
        System.out.printf("Average of First Half Elements of the array: %.2f" , AvgOfFirstHalfElements);
    }
}