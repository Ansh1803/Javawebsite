public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = "Hello World!";
        String output = input.replaceAll("\\s", "");
        System.out.println(output); 
    }
}
// Output: HelloWorld!
