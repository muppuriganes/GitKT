import java.util.*;
public class SetBit {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int pos = sc.nextInt();
            int bitMark = 1<<pos;

            int newNumber = bitMark | n;
            System.out.println(newNumber);
        }
        

    }
}
