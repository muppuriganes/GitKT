import java.util.*;
public class ArrayStringLenght {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String array[] = new String[size];
            int totLength = 0;

            for (int i=0; i<size; i++) {
                array[i] = sc.next();
                totLength = totLength + array[i].length();

            }
            System.out.print(totLength);
        }
    }
}