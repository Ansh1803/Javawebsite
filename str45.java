public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String output = new StringBuilder(input).reverse().toString();
        System.out.println(output);
    }
}
Output
olleH