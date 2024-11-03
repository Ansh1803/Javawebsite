import java.util.Scanner;

public class CheckDigitsOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the string contains only digits
        if (isDigitsOnly(input)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
    
    public static boolean isDigitsOnly(String str) {
        // Use regex to check if the string contains only digits
        return str.matches("\\d+");
    }
}

/*
Output (Example):
Enter a string: 123456
The string contains only digits.
*/
