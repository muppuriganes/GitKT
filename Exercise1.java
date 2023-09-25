public class Exercise1 {
    public static void main(String[]args) {
        int firNumber = 0;
        int secNumber = 1;
        System.out.print(firNumber +" "+secNumber+" ");
        

        for(;;) {
            int result = firNumber + secNumber;
            while (result<=50) {
            System.out.print(+result+" ");
            firNumber = secNumber;
            secNumber = result; 
            break;
            }
        }
    }
}