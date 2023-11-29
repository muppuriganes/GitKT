import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,11, 7, 15, 3, 9);
        int target = 7;
        Collections.sort(list);
        int index = Collections.binarySearch(list, target);
        System.out.println(index >= 0
                ? "Element " + target + " found at index " + index
                : "Element " + target + " not found in the list.");
    }
}

