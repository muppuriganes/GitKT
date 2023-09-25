public class Exercise4 {
    public static void main(String[]args) {
        int a = 0; 
        int b = 1;

        System.out.print(a);

        for(; ;) {
            a = a + b;
            b = a - b;
            System.out.print(" "+ a);

            if(a+b>50) {
                break;
            }
        }
    }
}
