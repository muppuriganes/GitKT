import java.util.Scanner;
public class SequenceFactofial {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            double sum = 0.0;

            for(int i = 1; i<=n; i++) {
                long f = 1;
                for(int j=1 ; j<=n; j++) {
                    f*= j;
                }
                sum+=(1.0/f); 

            }
            System.out.println("Sum = " +sum);
        }

    }
}