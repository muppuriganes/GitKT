import java.util.Scanner;
public class Arrays {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int size = sc.nextInt();
            int[] number = new int[size];

            //input
            for(int i=0; i<size; i++) {
                System.out.print("Enter the element "+(i + 1)+ " : ");
                number[i] = sc.nextInt();
            }

            System.out.print("Enter the element for the index : ");
            int x = sc.nextInt();

            //output
            for(int i=0; i<number.length; i++) {
                if(number[i]==x) {
                    System.out.print("The index value is : "+i);
                }
            }
        }
    }

    public static Object asList(int i, int j, int k, int l, int m) {
        return null;
    }
}