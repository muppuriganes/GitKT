import java.util.Scanner;

public class CircleArea {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle : ");
            double radius= sc.nextDouble();

            double Area = calculateArea(radius);
            System.out.print("The area of the circle with giver " +radius+ " is " +Area);
        }
    }

    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
}
