import java.util.StringTokenizer;

public class EvenLengthWords {
    public static void main(String[] args) {
        String sentence = "Hello there this is a test";
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        
        System.out.print("Even length words: ");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() % 2 == 0) {
                System.out.print(word + " "); 
            }
        }
    }
}
