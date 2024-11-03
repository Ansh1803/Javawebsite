import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c + " occurs " + charCount.get(c) + " times.");
            }
        }
    }
}

/* Output:
r occurs 2 times.
g occurs 2 times.
*/