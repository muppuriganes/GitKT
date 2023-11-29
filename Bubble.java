import java.util.*;

public class Bubble {
    public static void bubbleSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    Collections.swap(numbers, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        int[] inputArray = {64, 25, 12, 22, 11};
        for (int num : inputArray) {
            numbers.add(num);
        }

        bubbleSort(numbers);

        System.out.println("Sorted array: " + numbers);
    }
}
