package guvi;

import java.util.ArrayList;

public class RemovingAllElementInArray {

	public static void main(String[] args) {
	
		 ArrayList<String> myArray = new ArrayList<>();

	        
	        myArray.add("Shree");
	        myArray.add("Hari");
	        myArray.add("Farook");
	        myArray.add("Ravi");
	        
	        System.out.println("My Array Before Removel :: " + myArray);
	        
	        myArray.removeAll(myArray);
	        
	        System.out.println("My Array After Removel :: " + myArray);

	}
	
}
