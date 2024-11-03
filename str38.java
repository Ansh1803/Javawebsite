public class SwapCase {
    public static void main(String[] args) {
        String input = "Hello World!";
        String output = input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(output); 
    }
}
// Output: hELLO wORLD!
