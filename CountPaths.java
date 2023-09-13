import java.util.*;
public class CountPaths {
    public static int countPaths(int i, int j, int n, int m) {
        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 && j == m-1) {
            return 1;
        }
        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.print("Enter m : ");
            int m = sc.nextInt();
            int totalPaths = countPaths(0, 0, n, m);
            System.out.println(totalPaths);
        }
    }
}
