public class StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        buffer.insert(5, ",");
        int start = buffer.indexOf("World");
        buffer.replace(start, start + 5, "Java");
        buffer.delete(0, 1);
        System.out.println(buffer); 
    }
}
// Output: ello, Java
