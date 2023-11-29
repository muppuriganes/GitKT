import java.util.*;
public class GreaterNum {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Smaller number is : "+Math.min(a, b));
        System.out.println("Largest number is : "+Math.max(a, b));
    }  
  }
}
