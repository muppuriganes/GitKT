import java.util.Scanner;
public class PalandromicPattern {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the n: ");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++) {
                //Spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                for(int j=1; j<=i; j++){
                    System.out.print(i+" ");
                }

                System.out.println();
            }
        }
    }
}
    