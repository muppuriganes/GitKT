import java.util.*;
public class Recursion7 {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x' ) {
            count++;
            moveAllX(str, idx+1, count, newString);

        }else {
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }

    }

    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            moveAllX(str,0,0,"");
        }
    }
}