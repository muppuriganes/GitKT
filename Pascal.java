import java.util.Scanner;
public class Pascal{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=1; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(" *");
                //num = num * (i-k)/(k+1);
            }
            System.out.println("");
        }
    }

}