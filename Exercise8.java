//using do While loop(Factorial)
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();
            int fact = 1;

            if(n<=0) {
                System.out.print("Factorial is not defined for negative numbers");
                return;
            }

            for(int i=1; i<=n; i++) {
                fact *= i;
            }
            System.out.print(fact);
        }
    }
}
