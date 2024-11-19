package guvi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
    	
        String filePath = "example.txt";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            
            System.out.println("File contents:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: File not found at " + filePath);
        } finally {
           
            System.out.println("File reading operation completed.");
        }
    }
}
