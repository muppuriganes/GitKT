import java.util.Scanner;
public class PatternButterfly {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            //First Half
            for(int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                //spaces
                int spaces=2 * (n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }

                //2nd part
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //Reverse(Second half)
            for(int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                //spaces
                int spaces=2 * (n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }

                //2nd part
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();    
            }
        }
    }
}
