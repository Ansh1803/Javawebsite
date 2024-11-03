import java.util.Scanner;

public class GetCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; // Index of the character to get
        char ch = str.charAt(index);
        
        System.out.println("Character at index " + index + ": " + ch); 
    }
}

// Output: o