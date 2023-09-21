import java.util.Scanner;
public class Exercise2 {
    //Even numbers
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();

            for(int i = 0; i<=n; i+=2){
                System.out.print(i+" ");
            }
        }

    }
}
