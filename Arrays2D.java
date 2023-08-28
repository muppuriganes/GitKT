import java.util.Scanner;
public class Arrays2D {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];

            //input
            //rows
            for(int i=0; i<rows; i++) {
                //coloumns
                for (int j=0; j<cols; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            for (int i=0; i<rows; i++) {
                for(int j=0; j<cols; j++) {
                    if(numbers[i][j]==x)
                    System.out.print("X found at the location is (" +i+ " , " +j+")");
                }
                System.out.println();
            }
        }
    }
}
