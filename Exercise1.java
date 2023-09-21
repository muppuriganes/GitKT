import java.util.Scanner;
//FibonacciSeries
public class Exercise1 {
   public static void main(String[]args) {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.print(a +", "+b);

        for(int i = 2; i<=n; i++) {
            int nextNum = a + b;
            System.out.print(", "+nextNum);
            a = b;
            b = nextNum;
        }
    }
    
    System.out.println();
   }
}
