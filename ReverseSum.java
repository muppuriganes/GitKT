

public class ReverseSum {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        int sum = 0;

        // Calculate the sum of the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum += twoDArray[i][j];
            }
        }

        System.out.println("Sum of the 2D array: " + sum);

        // Convert sum to string and reverse
        String sumAsString = String.valueOf(sum);
        String reversedSum = new StringBuilder(sumAsString).reverse().toString();

        System.out.println("Reversed sum: " + reversedSum);
    }
}