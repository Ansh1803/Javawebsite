import java.util.HashSet;

public class Subsets {
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> subsets = new HashSet<>();
        int total = 1 << str.length();
        for (int i = 0; i < total; i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) > 0) {
                    subset.append(str.charAt(j));
                }
            }
            subsets.add(subset.toString());
        }
        for (String s : subsets) {
            System.out.println(s);
        }
    }
}

/* Output:
(empty string)
a
b
c
ab
ac
bc
abc
*/
