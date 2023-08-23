import java.util.Scanner;
public class ReverseTheSumDigits {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number i : ");
            int n,r,sum= sc.nextInt();


            while(n>0); {
                r=n%10;
                sum=sum+r;
                n=n/10;
                
            }
            System.out.print("");
        }



    }
}
