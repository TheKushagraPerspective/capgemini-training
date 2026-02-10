package Day9;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        for(int i=0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }


        sc.close();
    }
}