public class CountPunctuation {
    public static void main(String[] args) {
        String str = "Hello, World! How's it going?";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (String.valueOf(c).matches("\\p{Punct}")) {
                count++;
            }
        }
        System.out.println("Total punctuation characters: " + count);
    }
}

/* Output:
Total punctuation characters: 4
*/
