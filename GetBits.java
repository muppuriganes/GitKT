import java.util.*;
public class GetBits {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int pos = sc.nextInt();
            int bitMark = 1<<pos;

            if ((bitMark & n) == 0) {
                System.out.println("Bit was zero");
            }
            else {
                System.out.println("Bit was one");
            }
        }
    }
}