import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String mostRepeated = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > maxCount) {
                maxCount = wordCount.get(word);
                mostRepeated = word;
            }
        }
        System.out.println("Most repeated word: " + mostRepeated);
    }
}

/* Output:
Most repeated word: (depends on file content)
*/
