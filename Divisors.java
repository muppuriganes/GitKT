import java.util.Scanner;
public class Divisors{
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int number = input.nextInt();

            System.out.println("Divisors of" + number + ":");
                for(int i=1 ; i<=number ; i++) {
                    if( number%i==0){
                        System.out.println(i);
                    }
                }
        } 
    }
}