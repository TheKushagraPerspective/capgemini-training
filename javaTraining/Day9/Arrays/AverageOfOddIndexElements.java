package Day9.Arrays;


public class AverageOfOddIndexElements {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,7,6};
        int sumOfOddIndexElements = 0;
        int countOfOddIndexElements = 0;
        


    
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 != 0) {    
                countOfOddIndexElements++;
                sumOfOddIndexElements += arr[i];
            }
        }

        double AvgOfOddIndexElements = ((double)sumOfOddIndexElements / countOfOddIndexElements);
        System.out.printf("Average of Odd Index ELements of the array: %.2f" , AvgOfOddIndexElements);
    }
}