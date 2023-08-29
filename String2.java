import java.util.*;
public class String2 {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();
            String result = "";
            
            for(int i=0; i<n.length(); i++) {
                if(n.charAt(i)== 'e') {
                    result = result+'i';
                }
                else {
                    result = result + n.charAt(i);
                }

            }

            System.out.println(result);
        }
    }
}