import java.util.*;
public class Recursion3 {
    public static void towerOfHanoi(int n, String src, String helper, String dest ) {
        if (n == 1) {
            System.out.println("Transfer dist " + n + " from " + src + " to" +dest );
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer dist " + n + " from " + src + " to" +dest);
        towerOfHanoi(n-1, helper, src, dest );
    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            towerOfHanoi(n, "S", "H", "D");
        }
        
    }
}
