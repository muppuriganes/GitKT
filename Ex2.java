public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 110:");
        for (int i = 0; i <= 110; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
