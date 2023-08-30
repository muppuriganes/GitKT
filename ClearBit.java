import java.util.*;
public class ClearBit {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int pos = sc.nextInt();
            int bitMask = 1<<pos;
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
