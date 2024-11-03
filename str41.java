public class SplitString {
    public static void main(String[] args) {
        String input = "Hello World! Welcome to Java.";
        String[] output = input.split(" ");
        for (String str : output) {
            System.out.println(str);
        }
    }
}
Output
Hello
World!
Welcome
to
Java.
