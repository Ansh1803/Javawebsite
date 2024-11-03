public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        str1 = str1 + str2; // HelloWorld
        str2 = str1.substring(0, str1.length() - str2.length()); // Hello
        str1 = str1.substring(str2.length()); // World
        System.out.println(str1 + " " + str2);
    }
}
Output
World Hello