import java.util.Scanner;
public class Functions1 {
    public static int additionSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A : " );
            int a= sc.nextInt();
            System.out.print("Enter B : " );
            int b= sc.nextInt();

            int sum = additionSum(a, b);
            System.out.println("The Sum od the 2 numbers : "+sum);
        }

    }
    
}
