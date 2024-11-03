public class CommandLineExample {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

/*
(Example Run):
java CommandLineExample Hello World
Output:
Command Line Arguments:
Hello
World
*/
