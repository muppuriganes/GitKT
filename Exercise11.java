import java.util.*;
public class Exercise11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int number = sc.nextInt();
            boolean isPerfectSquare = isPerfectSquare(number);

            if (isPerfectSquare) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
