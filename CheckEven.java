package Codechef;

public class CheckEven {
	 public static void main(String[] args) {
	        // Loop from 1 to 10
	        for (int i = 1; i <= 10; i++) {
	            if (i % 2 == 0) { // Check if number is even
	                continue; // Skip even numbers
	            }
	            System.out.println(i); // Print only odd numbers
	        }
	    }
}
