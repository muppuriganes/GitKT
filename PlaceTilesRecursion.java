import java.util.*;
public class PlaceTilesRecursion {
    public static int placeTiles(int n, int m) {

        if(n==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }

        int verPlacement = placeTiles(n-m, m);
        int horPlacement = placeTiles(n-1, m);

        return verPlacement + horPlacement;
    } 
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = sc.nextInt();
            System.out.print("Enter M : ");
            int m = sc.nextInt();

            System.out.println(placeTiles(n, m));
        }
    }
}
