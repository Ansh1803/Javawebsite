import java.util.HashMap;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "This is a test This is only a test";
        String[] words = str.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " occurs " + wordCount.get(word) + " times.");
            }
        }
    }
}

/* Output:
this occurs 2 times.
is occurs 2 times.
a occurs 2 times.
test occurs 2 times.
*/
