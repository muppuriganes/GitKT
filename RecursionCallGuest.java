import java.util.*;
public class RecursionCallGuest {
    public static int callGuest(int n) {
        if(n <=1 ) {
            return 1;
        }

        //single
        int way1 = callGuest(n-1);

        //couple 
        int way2 = (n-1) * callGuest(n-2);

        return way1 + way2;
    }
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();
            System.out.println(callGuest(n));
        }
    }
}
