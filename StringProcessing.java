package Codechef;

public class StringProcessing {
	 public static void main(String[] args) {
	        String text = "Hello Java"; // Input string
	        int count = 0; // Counter for characters
	        int i = 0; // Index for while loop

	        while (i < text.length()) { // Loop through each character
	            System.out.println(text.charAt(i)); // prints each character
	            count++; // Increment the character counter
	            i++; // Move to next character
	        }

	        // Print the total number of characters in the string
	        System.out.println("Total number of characters: " + count);
	    }
}
