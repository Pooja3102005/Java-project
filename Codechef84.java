package Codechef;

public class Codechef84 {
	 public static void main(String[] args) {
	        // Step 1: Initialize a string
	        String text = "Hello, Java programmer!";

	        // Step 2: Use the contains() method to check for specific substrings
	        boolean containsJava = text.contains("Java");            // Returns true
	        boolean containsJAVA = text.contains("JAVA");            // Returns false (case-sensitive)
	        boolean containsEmptyString = text.contains("");         // Returns true (empty string is always contained)

	        // Step 3: Print the results
	        System.out.println("Contains 'Java': " + containsJava);
	        System.out.println("Contains 'JAVA': " + containsJAVA);
	        System.out.println("Contains empty string: " + containsEmptyString);
	    }
}
