import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }

    private static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
            }
        }
    }
}

/* Output:
abc
acb
bac
bca
cab
cba
*/
