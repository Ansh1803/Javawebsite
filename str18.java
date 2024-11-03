public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        boolean isRotation = (str1.length() == str2.length()) && (str1 + str1).contains(str2);
        System.out.println(isRotation ? "Strings are rotations" : "Strings are not rotations");
    }
}

/* Output:
Strings are rotations
*/
