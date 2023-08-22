import java.util.Scanner;
public class Swaping{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Numbers before swaping : ");
            System.out.print("Enetr the A value :- ");
            int a = sc.nextInt();
            System.out.print("Enetr the B value :- ");
            int b = sc.nextInt();

            int t = a;
            a = b;
            b = t;

            System.out.println("Numbers after swaping A value is : " + a + " and B value is : " + b );
        }

    }
}