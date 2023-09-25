//using do While loop(Factorial)
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();

            if(n<=0) {
                System.out.print("Factorial is not defined for negative numbers.");
                return;
            }
            int fact = 1;
            int i = 1;
            do{
                fact = fact*i;
                i++;
            }while (i<=n);
            System.out.print(fact);
        }
    }
}
