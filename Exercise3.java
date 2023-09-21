import java.util.Scanner;
public class Exercise3 {
    //multiplaction of numbers from A to B
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = sc.nextInt();  // input 23
            System.out.print("Enter B : ");
            int b = sc.nextInt();  // input 28
            int result = 1;

            for(int i=a; i<=b; i++) {
                result = result*i;    
            }
            System.out.print(result);
        }
    }
}
