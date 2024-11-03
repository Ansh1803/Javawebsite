public class InsertStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(5, ",");
        System.out.println("Inserted String: " + sb);
    }
}

/*
Output:
Inserted String: Hello, World
*/
