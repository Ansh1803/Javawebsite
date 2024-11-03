import java.util.HashMap;

public class MaxMinChar {
    public static void main(String[] args) {
        String str = "abacabad";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char maxChar = ' ', minChar = ' ';
        int maxCount = 0, minCount = Integer.MAX_VALUE;
        for (char c : frequencyMap.keySet()) {
            int count = frequencyMap.get(c);
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            }
            if (count < minCount) {
                minCount = count;
                minChar = c;
            }
        }
        System.out.println("Max: " + maxChar + ", Min: " + minChar);
    }
}

/* Output:
Max: a, Min: b
*/
