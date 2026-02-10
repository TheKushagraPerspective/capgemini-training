package Day9.Arrays;

public class CheckForElement {
    public static void main(String[] args) {
        int arr[] = new int[]{65,351,53,321,165,11};

        int target = 321;
        boolean found = false;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] == target) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Target " + target + " is present in the array");
        }
        else {
            System.out.println("Target " + target + " is not present in the array");
        }
    }
}
