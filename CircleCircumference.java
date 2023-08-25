import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();

            double circumference = calculateCircumference(radius);
            System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
        }
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
