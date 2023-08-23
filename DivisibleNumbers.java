import java.util.Scanner;
public class DivisibleNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter i : ");
        int i= sc.nextInt();
        System.out.print("Enter j : ");
        int j= sc.nextInt();

        for(int k=1; k<=i; k++) {
            if( k%j==0) {
                System.out.println(k);
            }
        }
    }
}