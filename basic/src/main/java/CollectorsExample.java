import java.util.*;
import java.util.stream.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> lengths = names.stream()
                                     .collect(Collectors.mapping(String::length, Collectors.toList()));

        System.out.println(lengths);
    }
}
