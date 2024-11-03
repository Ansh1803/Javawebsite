public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println("After trying to modify: " + str);
    }
}

/*
Output:
After trying to modify: Hello
*/
