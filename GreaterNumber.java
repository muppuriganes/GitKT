import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A: ");
            int a = sc.nextInt();
            System.out.print("Enter B: ");
            int b = sc.nextInt();

            int Result= findGreaterNumber(a,b);
            System.out.println("The greater number between "+a+ " and "+b+ " is " +Result);
        }
    }

    public static int findGreaterNumber(int a, int b) {
        return a > b ? a : b;
    }
}
