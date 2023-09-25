//using for-each loop(Factorial)
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int number = sc.nextInt(); 
            long factorial = 1;

            
            int[] numbers = new int[number];
            for (int i = 0; i < number; i++) {
                numbers[i] = i + 1;
            }

            // Using a for-each loop to calculate the factorial
            for (int num : numbers) {
                factorial *= num;
            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
