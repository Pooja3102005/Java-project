package Codechef;
import java.util.Scanner;
public class Ifdelivery {
	 
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

	        // Read the weight input from the user
	        double weight = scanner.nextDouble(); 
	        
	        // Consume the leftover newline character
	        scanner.nextLine(); 
	        // Read the delivery speed input from the user
	        String deliverySpeed = scanner.nextLine(); 

	        // Check if the weight of the package is within the allowed limit
	             if (weight <= 5){
	            // Check if the delivery speed is "Express"
	             if  (deliverySpeed.equalsIgnoreCase("Express")){
	                 System.out.println("Shiping charge: $15");
	             } else {
	                 System.out.println("Shiping charge: $10");
	             } 
	             } else {
	                 System.out.println("Shiping not available for package above5 kg.");
	             }


	        scanner.close(); // Close the Scanner object to prevent resource leaks
	    }
}
