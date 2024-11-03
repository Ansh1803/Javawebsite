import java.io.File;
import java.io.FileNotFoundException;
import java.io.Scanner;
 class FileReaderExample {

    public static void main(String[] args) {
        String filePath = "example.txt"; 

        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        
        scanner.close();
    }
}

