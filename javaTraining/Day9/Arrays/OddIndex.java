package Day9.Arrays;


public class OddIndex {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};


        System.out.println("All Odd Index ELements of the array");
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 != 0) {    
                System.out.println("Element at index " + (i) + " : " + arr[i]);
            }
        }
    }
}