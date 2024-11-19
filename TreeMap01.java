package guvi;

import java.util.TreeMap;

public class TreeMap01 {

public static void main(String[] args) {
	        

	TreeMap<Integer, String> employees = new TreeMap<>();

	        employees.put(101, "John");
	        employees.put(102, "Alice");
	        employees.put(103, "Zara");
	        employees.put(104, "Bob");

	       System.out.println("Employee names in alphabetical order:");
	        employees.values().stream()
	                 .sorted()
	                 .forEach(System.out::println);
	    }
	}


