import java.util.*;
import java.util.stream.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
             .parallel()  // Make the stream parallel
             .forEachOrdered(System.out::println);  // Preserve order
    }
}
