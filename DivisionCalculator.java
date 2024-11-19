package guvi;

import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for input45
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;

            // Display the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            // Close the scanner
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}


