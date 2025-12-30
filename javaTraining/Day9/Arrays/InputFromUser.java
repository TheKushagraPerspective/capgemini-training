package Day9.Arrays;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i=0 ; i<5 ; i++) {
            System.out.print("Element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("All ELements of the array");
        for(int i=0 ; i<5 ; i++) {
            System.out.println("Element " + (i+1) + " : " + arr[i]);
        }


        sc.close();
    }
}