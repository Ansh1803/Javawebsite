public class DivideString {
    public static void main(String[] args) {
        String str = "abcdefgh";
        int n = 4;
        int len = str.length();
        for (int i = 0; i < len; i += n) {
            System.out.println(str.substring(i, Math.min(len, i + n)));
        }
    }
}

/* Output:
abcd
efgh
*/
