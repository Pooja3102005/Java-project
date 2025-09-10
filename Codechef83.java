package Codechef;

public class Codechef83 {
	public static void main(String[] args) {
        // Define a string
        String text = "This is a simple example.";

        // Find the last space in the string
          int lastIndexofSpace = text.lastIndexOf(" ");
          

        // Extract the last word
          String lastword  = text.substring(lastIndexofSpace + 1);
          

        // Print the result
           System.out.println(" The last word is: " + lastword);
    }
}
