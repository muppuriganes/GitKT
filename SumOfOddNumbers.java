import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int sum=0;
            for (int i=1; i<=n; i=i+2){
                sum = sum + i;
                System.out.println(i);
                
                
            }
            System.out.println("Sum of the oddnumbers is : " +sum);
        }
        
    }
    
}
