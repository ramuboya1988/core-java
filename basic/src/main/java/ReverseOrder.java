import java.util.*;
import java.util.stream.*;

public class ReverseOrder {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> sortedList = strings.stream()
                                         .sorted(Comparator.reverseOrder())
                                         .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
