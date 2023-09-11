import java.util.*;
public class Recursion9 {
    public static void subSequance(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSequance(str, idx+1, newString+currChar);

        // or not be
        subSequance(str, idx+1, newString);
    }
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String : ");
            String str = sc.nextLine();
            subSequance(str, 0, "");
        }
    }
}