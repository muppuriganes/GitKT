import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class new1 {
    public static void main(String[] args) {
        String[] str = new String[]{"Java", "My world", "Lava", "kova", "tova", "gava", "vava"};

        List<String> wordsContainingVa = Arrays.stream(str)
                .filter(word -> word.contains("va"))
                .collect(Collectors.toList());

        wordsContainingVa.forEach(System.out::println);
    }
}