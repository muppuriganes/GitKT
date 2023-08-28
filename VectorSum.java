import java.util.Scanner;
public class VectorSum {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size :");
            int size = sc.nextInt();

            int[] vector = new int [size];
            for (int i = 0; i<size; i++) {
                System.out.print("Enter element" +(i + 1)+ ": ");
                vector[i] = sc.nextInt();
            }

            int positiveSum = 0;
            int negativeSum = 0;

            for(int num : vector) {
                if (num > 0) {
                    positiveSum += num;
                }else if(num < 0) {
                    negativeSum += num;
                }
            }
            System.out.println("Sum of positive numbers :" +positiveSum);
            System.out.println("Sum of negative numbers :" +negativeSum);
        }
    }
}