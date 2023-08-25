import java.util.Scanner;
public class PatternsAll {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n= sc.nextInt();
            System.out.print("Enter M: ");
            int m= sc.nextInt();

            for(int i=1; i<=n; i++) {
                for(int j=1; j<=m; j++) {
                    System.out.print("+");
                }

                System.out.println();
            }
        }       
    }
}

