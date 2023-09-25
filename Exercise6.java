//using While loop(Factorial using while loop)
import java.util.*;
public class Exercise6 {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();

            if(n < 0) {
                System.out.print("Factorial is not defined for negative numbers.");
                return;
            } 

            int fact = 1;
            int i = 1;

            while(i<=n) {
                fact = fact*i;
                i++;
            }
            System.out.print(fact);
        }
    }
}
