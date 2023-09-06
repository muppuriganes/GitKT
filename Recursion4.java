import java.util.*;
public class Recursion4 {
    public static void printRev(String str, int x) {
        if (x == 0) {
            System.out.print(str.charAt(x));
            return;
        }

        System.out.print(str.charAt(x));
        printRev(str, x-1);

    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter N: ");
            String str = sc.next();
            printRev(str, str.length()-1);
        }
    }
}