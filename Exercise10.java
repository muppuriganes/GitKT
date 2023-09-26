import java.util.*;
public class Exercise10 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++) {
            fact *= i;
            //i++ ;
            //System.out.println(fact);
        }
        System.out.println(fact);
    }
}