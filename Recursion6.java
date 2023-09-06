import java.util.*;
public class Recursion6 { 
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length-1) {
            return true;
        }

        if (arr[idx] < arr[idx+1]) {
            return isSorted(arr, idx+1);
        }else {
            return false;
        }
    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n=sc.nextInt();
            System.out.print("Enter Array :");
            int[] arr = new int[n]; 
            for(int i = 0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(isSorted(arr, 0));
        }

    }
}