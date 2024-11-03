public class LargestSmallestWord {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String[] words = str.split(" ");
        String largest = "", smallest = words[0];
        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        System.out.println("Largest: " + largest + ", Smallest: " + smallest);
    }
}

/* Output:
Largest: jumps, Smallest: The
*/
