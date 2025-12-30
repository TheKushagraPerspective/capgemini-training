package Day9.Arrays;


public class AverageOfEvenIndexElements {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,6};
        int sumOfEvenIndexElements = 0;
        int countOfEvenIndexElements = 0;
        


    
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 == 0) {    
                countOfEvenIndexElements++;
                sumOfEvenIndexElements += arr[i];
            }
        }

        double AvgOfEvenIndexElements = ((double)sumOfEvenIndexElements / countOfEvenIndexElements);
        System.out.printf("Average of Even Index ELements of the array: %.2f" , AvgOfEvenIndexElements);
    }
}