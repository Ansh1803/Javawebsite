import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of words: " + wordCount);
    }
}

/* Output:
Number of words: (depends on file content)
*/
