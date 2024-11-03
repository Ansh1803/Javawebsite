import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        String str = "abcde";
        String smallest = str.charAt(0) + "" + str.charAt(0);
        String biggest = new StringBuilder(smallest).reverse().toString() + smallest;
        
        System.out.println("Smallest Palindrome: " + smallest); 
        System.out.println("Biggest Palindrome: " + biggest);  }
}
