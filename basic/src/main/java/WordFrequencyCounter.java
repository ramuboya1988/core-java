import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "Java is easy to learn and Java is fun to use";

        // Convert to lowercase and split by spaces
        String[] words = text.split("\\s+");

        // Create HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Loop through words and count
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print results
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
