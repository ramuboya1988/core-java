import java.util.*;
import java.util.stream.*;

public class ToArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String[] namesArray = names.stream()
                                   .toArray(String[]::new);

        System.out.println(Arrays.toString(namesArray));
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 7);
        Optional<Integer> min = numbers.stream()
                .min((a, b) -> a.compareTo(b));
    }
}
