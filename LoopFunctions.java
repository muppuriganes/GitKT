import java.util.Scanner;
public class LoopFunctions {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int i = sc.nextInt(); 

            int j = 0;
            while(j < i) 
            {
                System.out.println(j);
                j =j + 1;
            }
        }
        
    }
}
