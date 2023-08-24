import java.util.Scanner;
public class PatternsA {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the row : ");
            int n = sc.nextInt();
            System.out.print("Enter the colomn : ");
            int m = sc.nextInt();

            for (int i = 1; i<=m; i++) {
                for (int j = 1; j<=n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}