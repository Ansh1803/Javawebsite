public class LongestRepeatingSequence {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substring = str.substring(i, j);
                if (str.indexOf(substring, j) != -1 && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        System.out.println("Longest repeating sequence: " + longest);
    }
}

/* Output:
Longest repeating sequence: abc
*/
