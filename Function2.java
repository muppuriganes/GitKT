import java.util.Scanner;
public class Function2 {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.print("The product of the 2 numbers : " +calculateProduct(a, b) );
        }
    }
    
}
