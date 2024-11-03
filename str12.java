public class StringToArray {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}

/* Output:
Hello
World
*/
