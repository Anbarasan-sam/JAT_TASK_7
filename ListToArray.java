package guvi;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        // Create a List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("List Elements ::" + fruits);

        
        String[] fruitsArray = fruits.toArray(new String[0]);

        
        System.out.println("Array elements :: ");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
