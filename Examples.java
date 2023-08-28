import java.util.Scanner;
public class Examples {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A: ");
            int a = sc.nextInt();
            
            for(int i=1; i<=a; i++) {
                System.out.println("Hello World");
            }
        }
    }

}
