public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        // Calculate the sum of all numbers in the matrix
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum of all numbers in the matrix: " + sum);

        int reversedSum = reverseDigits(sum);
        System.out.println("Reversed digits of the sum: " + reversedSum);

        
    }
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    public static String formatOutput(int number) {
        return String.format("%03d", number);
    }
}
