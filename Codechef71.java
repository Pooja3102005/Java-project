package Codechef;

public class Codechef71 {
	 public static void main(String[] args) {
	        // Example 1: Simple string
	        // The string "Hello, Java!" includes 12 characters (including spaces and punctuation).
	        String str1 = "Hello, Java!";
	        System.out.println("The length of the string \"" + str1 + "\" is: " + str1.length());

	        // Example 2: Empty string
	        // The length of an empty string should always be 0.
	        String str2 = "";
	        System.out.println("The length of the empty string is: " + str2.length());

	        // Example 3: String with spaces
	        // Even though the string has no visible text, spaces are considered valid characters and are counted in the length.
	        String str3 = "   ";
	        System.out.println("The length of the string with spaces is: " + str3.length());

	        // Example 4: String with special characters
	        // Special characters like '@' and '!' are also included when calculating the string's length.
	        String str4 = "Java@2023!";
	        System.out.println("The length of the string \"" + str4 + "\" is: " + str4.length());
	    }
}
