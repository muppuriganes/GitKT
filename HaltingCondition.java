import java.util.*;
public class HaltingCondition {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = sum(x , y);

            System.out.println(result);
        }
    }
    public static int sum(int start, int end) {
        if(end > start) {
            return end + sum(start,end - 1);
        }else {
            return end;
        }
    }
}
