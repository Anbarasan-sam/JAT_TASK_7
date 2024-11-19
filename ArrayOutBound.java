package guvi;

public class ArrayOutBound {

	public static void main(String[] args) {
		ArrayOUT();
	}
	public static void ArrayOUT() {
		
	int[] myArray = {1,2,3,4};
	
	try {
		System.out.println("Length of the Index :: " + myArray.length);
		System.out.println("Accessing 5th Index" + myArray[5]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Array index is out of bounds.");
        System.out.println("Exception message: " + e.getMessage());
    } finally {
        System.out.println("Finished array access.");
		}
	
	}
}
