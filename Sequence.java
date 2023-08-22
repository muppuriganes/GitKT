public class Sequence {
    public static void main(String[] args) {
        int n = 10; // Adjust n for the desired number of terms
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }

        System.out.println("Sum of the series: " + sum);
    }
}





