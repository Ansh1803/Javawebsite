public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = String.join(" ", new StringBuilder(input).reverse().toString().split(" "));
        System.out.println(output);
    }
}
output
World Hello