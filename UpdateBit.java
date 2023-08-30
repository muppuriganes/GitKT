import java.util.*;
public class UpdateBit {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int oper = sc.nextInt();

            int n = sc.nextInt();
            int pos = sc.nextInt();

            int bitMask = 1<<pos;
            if(oper == 1) {
                //set
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }
            else {
                //clear
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }
        }

    }
}
