import java.util.*;
public class Resursion {
    public static int calcfactorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            int ans = calcfactorial(n);
            System.out.println(ans);
        }
    }
}