package Day9.Arrays;

import java.util.Scanner;

public class ReadEvenIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i=0 ; i<5 ; i++) {
            if(i % 2 == 0) {
                System.out.print("Element: ");
                arr[i] = sc.nextInt();
            }
        }

        for(int i=0 ; i<5 ; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
