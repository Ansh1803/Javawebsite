public class DeepCopyString {
    public static void main(String[] args) {
        String original = "Hello";
        String deepCopy = new String(original);
        
        System.out.println("Original: " + original);
        System.out.println("Deep Copy: " + deepCopy);
    }
}

/*
Output:
Original: Hello
Deep Copy: Hello
*/
