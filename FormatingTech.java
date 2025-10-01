package Codechef;
import java.util.Scanner;
public class FormatingTech {
	 public static void main(String[] args) {
	        // Creating a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompting the user to enter a string
	        String userInput = scanner.nextLine(); // Example input:    Java-Programming  

	        // Applying different formatting techniques
	        String trimmedInput = userInput.trim();
	        String lowercaseInput = userInput.toLowerCase();
	        String uppercaseInput = userInput.toUpperCase();
	        String replacedInput = userInput.replace("-", "_");

	        // Displaying the formatted outputs
	        System.out.println("\nFormatted Outputs:");
	        System.out.println("Trimmed Input: " + trimmedInput);
	        System.out.println("Lowercase Input: " + lowercaseInput);
	        System.out.println("Uppercase Input: " + uppercaseInput);
	        System.out.println("Replaced Input: " + replacedInput);

	        // Closing the Scanner object to free resources
	        scanner.close();
	    }
}
