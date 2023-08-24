import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int i = sc.nextInt();

            
            for(int j=1; j<11; j++) {
                
                System.out.println(i*j);
            }
            
        }

    }
    
}
