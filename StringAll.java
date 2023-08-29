import java.util.*;
public class StringAll {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            String result = "";

            for(int i=0; i<str.length(); i++) {
                if (str.charAt(i)=='1') {
                    result = result + '2';

                }else {
                    result = result + str.charAt(i);
                }
            }
            System.out.println(result);
        }
    }
}