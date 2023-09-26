public class Exercise5 {
    public static void main(String[] args) {
        int[] elements = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};

        // Display unique and even numbers
        System.out.print("Unique even numbers : ");

        for(int i=0; i<elements.length; i++) {
            int num = elements[i];
            boolean isEven = num%2 == 0;
            boolean isUnique = true;

            for(int j=0;j<i; j++) {
                if(elements[j]==num) {
                    isUnique =false;
                    break;
                }
            }

            if(isEven && isUnique) {
                System.out.print(num + " ");
            }
        }
        
    }
}

