public class Exercise10{
    public static void main(String[]args) {
         
            int First = 0;
            int Second = 1;
            System.out.print(First+" "+Second+" ");
            int result;
            do {
                result = First + Second;
                if(result < 50) {
                System.out.print(+result+" ");
                }
                First =Second;
                Second =result;
            }
            while(result <50);
            
                
            }
        

    }
