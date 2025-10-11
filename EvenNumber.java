package Codechef;

public class EvenNumber {
	 public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	            if (i % 2 == 0) { // Check if the number is even
	                System.out.println("First even number found: " + i);
	                break; // Exit the loop once an even number is found
	            }
	        }
	    }
}
//break