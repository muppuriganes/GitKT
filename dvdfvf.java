import java.util.*;
public class dvdfvf {
  public static int sum(int k) {
    if (k >= 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
  public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter N: ");
        int result = sc.nextInt();
        //System.out.println(result);
        System.out.print(sum(result));
}
  }
}
