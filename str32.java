public class InsertString {
    public static void main(String[] args) {
        String original = "Hello World!";
        String toInsert = "Beautiful ";
        int position = 6; // Position to insert
        
        String result = original.substring(0, position) + toInsert + original.substring(position);
        System.out.println("Resulting String: " + result); 
    }
}
// Output: Hello Beautiful World!
