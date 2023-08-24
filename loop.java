import java.util.Scanner;
public class loop {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Text : ");
            int num = sc.nextInt();

            for(int i = 0; i<=num; i++);{
                System.out.println(num);
            }
        }
        
    }
    

}
