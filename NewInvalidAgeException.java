package guvi;
class InvalidAgeException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
        super(message);
    }
}


public class NewInvalidAgeException {
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        try {
            
            int userAge = 16;
            System.out.println("Validating age: " + userAge);

            
            validateAge(userAge);

            
            System.out.println("Age validation successful. Welcome!");

        } catch (InvalidAgeException e) {
            
            System.out.println("Error: " + e.getMessage());
        } finally {
            
            System.out.println("Program ended.");
        }
    }
}
