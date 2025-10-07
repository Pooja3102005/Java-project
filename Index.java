package Codechef;

public class Index {
	 public static void main(String[] args) {
	        // Define a string variable to hold the text we want to iterate over
	        String text = "Java 2025";
	        
	        // Use a for loop to iterate through each character in the string
	        // The loop runs from index 0 to the last index (text.length() - 1)
	        for (int i = 0; i < text.length(); i++) {
	            // Extract the character at the current index
	            char character = text.charAt(i);
	            
	            // Print the character along with its index
	            System.out.println("Character at index " + i + ": " + character);
	        }
	    }
}
