import java.util.*;
public class Recursion10 {
    public static void UniqueSubSequence(String str, int idx, String newString, HashSet<String> set ) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        UniqueSubSequence(str, idx+1, newString+currChar, set);

        UniqueSubSequence(str,idx+1,newString, set);
    }
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String : ");
            String str =  sc.nextLine();
            HashSet<String>set = new HashSet<>();
            UniqueSubSequence(str, 0, "", set);
        }
    }
}
