import java.util.Scanner;
public class Pattern {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n= sc.nextInt();

            //First form
            for(int i=1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                //Spaces
                int spaces=2 * (n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }

                //other side
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            //Reverse
            for(int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                //Spaces
                int spaces=2 * (n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }

                //other side
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                System.out.println();
   }
        }
}
}