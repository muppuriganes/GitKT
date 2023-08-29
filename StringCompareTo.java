import java.util.*;
public class StringCompareTo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name1 = sc.nextLine();
            String name2 = sc.nextLine();

            //1 s1 > s2 : +ve value
            //2 s1 = s2 : 0
            //3 s1 < s2 : -ve value

            if(name1.compareTo(name2)==0) {
                System.out.println("String are Equal");
            }else {
                System.out.println("String are NOT equal");
            }
        }

    }
}
