import java.util.*;
public class StringCompare2 {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            String sentence = sc.nextLine();
            int n = sc.nextInt();

            String name = sentence.substring(n);
            System.out.println(name);
        } 
    }
}