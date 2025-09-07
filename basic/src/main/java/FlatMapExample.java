import java.util.*;
import java.util.stream.*;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                                                 .flatMap(list->list.stream())
                                                 .collect(Collectors.toList());

        flattenedList.forEach(System.out::println);
    }
}
