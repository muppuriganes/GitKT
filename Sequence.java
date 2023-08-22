import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enetr the number : ");
            int n = sc.nextInt();
            double sum = 0.0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum -= 1.0 / i;
                } else {
                    sum += 1.0 / i;
                }
                System.out.println(sum);
            }

            System.out.println("Sum of the series: " + sum);
        }
    }
}





