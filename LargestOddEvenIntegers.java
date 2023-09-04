import java.util.Scanner;
public class LargestOddEvenIntegers {
   public static void main(String[]args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the lower range limit: ");
        int lowerLimit = sc.nextInt();

        System.out.print("Enter the upper range limit: ");
        int upperLimit = sc.nextInt();

        int largestEven = Integer.MIN_VALUE;
        int largestOdd = Integer.MIN_VALUE;

        for (int i = lowerLimit; i<=upperLimit; i++) {
            if(i%2==0 && i>largestEven) {
                largestEven = i;
            }else if (i%2!=0 && i>largestOdd) {
                largestEven = i;
            }
        }

        if (largestEven == Integer.MIN_VALUE) {
            System.out.println("No even numbers found in the range.");
        } else {
            System.out.println("Largest even integer: " + largestEven);
        }

        if (largestOdd == Integer.MIN_VALUE) {
            System.out.println("No odd numbers found in the range.");
        } else {
            System.out.println("Largest odd integer: " + largestOdd);
        }
    }
    
   } 
}
