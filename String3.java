import java.util.*;
public class String3{
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            String email = sc.next();
            String userName = "";

            for (int i =0; i<email.length(); i++) {
                if(email.charAt(i)=='@') {
                    break;
                }else {
                    userName = userName + email.charAt(i);
                }
            }
            System.out.println(userName);
        }

    }
}