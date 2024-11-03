public class CountWords {
    public static void main(String[] args) {
        String str = "This is a sample string";
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}

/* Output:
Number of words: 5
*/
