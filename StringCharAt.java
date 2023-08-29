import java.util.*;
public class StringCharAt {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            String fullName = firstName + " " + lastName;

            //ChatAt

            for(int i=0; i<=fullName.length(); i++) {
                System.out.println(fullName.charAt(i));
            }
        }
    }
}
