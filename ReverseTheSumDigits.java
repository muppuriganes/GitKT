import java.util.Scanner;
public class ReverseTheSumDigits {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number i : ");
            int num=sc.nextInt();
            int r,sum= sc.nextInt();


            while( num>0); {
                r=num%10;
                sum=sum+r;
                num=num/10;
                
            }
            System.out.print("");
        }



    }
}
