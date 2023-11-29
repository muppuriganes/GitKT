import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{2, 2, 3, 4, 2, 3, 5, 23, 34, 54, 56, 34, 8, 3, 90, 23, 43, 54, 56, 34, 43, 43, 43};

        List<Integer> evenNumbers = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0) // Filter even numbers
                .collect(Collectors.toList()); // Collect even numbers into a list

        List<Integer> uniqueEvenNumbers = Arrays.stream(numbers)
                .distinct() // Keep only unique numbers
                .collect(Collectors.toList()); // Collect unique even numbers into a list

        List<Integer> evenUniqueNumbers = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0) // Filter even numbers
                .distinct() // Keep only unique numbers
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        evenNumbers.forEach(num -> System.out.print(num + " "));
        
        System.out.println("\nUnique Even Numbers:");
        uniqueEvenNumbers.forEach(num -> System.out.print(num + " "));

        System.out.println("\nEven Unique Numbers:");
        evenUniqueNumbers.forEach(num -> System.out.print(num + " "));
    }
}
