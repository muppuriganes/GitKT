
import java.util.*;
public class Recursion5 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            }else {
                last = idx;
            }
        }

        findOccurence(str, idx+1, element);

    }

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter N : ");
            String str = sc.next();
            findOccurence(str, 0, 'e');
        }
    }
}