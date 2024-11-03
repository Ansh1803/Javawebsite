import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        String result = input.replace(Character.toString(charToRemove), "");
        System.out.println("Resulting string: " + result);
    }
}

/*
Output (Example):
Enter a string: Hello World
Enter character to remove: o
Resulting string: Hell Wrld
*/
