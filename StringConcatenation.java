import java.util.*;
public class StringConcatenation {
    public static void main(String[]args) {
        try (//concatenation
        Scanner sc = new Scanner(System.in)) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            //String fullName = firstName +" "+lastName;

            System.out.println(firstName.length() + " "+ lastName.length());
        }
    }
}
