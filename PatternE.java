import java.util.Scanner;
public class PatternE {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System .out.print("Enter n: ");
            int n = sc.nextInt();
            
            for(int i=1; i<=n; i++) {
                for (int j=0; j<n-i; j++) {
                    System.out.print(" ");
                }
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
