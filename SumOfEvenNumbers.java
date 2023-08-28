import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N value : ");
            int n = sc.nextInt();

            int sum = 0;
            for (int i=0; i<=n; i=i+2){
                sum = sum + i;
                System.out.println(i);
            }

                    System.out.println(sum);
        }
            }
            
        }