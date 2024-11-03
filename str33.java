public class IterateCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        
        System.out.print("Characters in the string: ");
        for (char ch : str.toCharArray()) {
            System.out.print(ch + " "); 
        }
    }
}
// Output: H e l l o
