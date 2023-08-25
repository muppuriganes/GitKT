import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A: ");
            double a = sc.nextDouble();
            System.out.print("Enter B: ");
            double b = sc.nextDouble();
            System.out.print("Enter C: ");
            double c = sc.nextDouble();

            double avg= calculateAverage(a,b,c);
            System.out.println("The Average of the Three numbers is :"+avg);
        }
    }

    private static double calculateAverage(double a, double b, double c) {
        return (a+b+c)/3;
    }
}
