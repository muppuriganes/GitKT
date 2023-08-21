public class DivisibleNumbers {
    public static void main(String[] args){
        int i=200;
        int j=7;

        System.out.println("Number between 1 and " + i + "Divisible by "+ j +";");

        for(int k=1 ; k<=i ; k++) {
            if( k%j==0 ){
                System.out.println(k);
            }
        }
    }
}
