public class SeparateCharacters {
    public static void main(String[] args) {
        String input = "Hello";
        String output = String.join(" ", input.split(""));
        System.out.println(output); 
    }
}
// Output: H e l l o
    