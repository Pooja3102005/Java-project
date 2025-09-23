package Codechef;

public class Multiplevariable {
	 public static void main(String[] args) {  
	        int countUp = 1;  // Initialize the variable countUp to 1
	        int countDown = 5;  // Initialize the variable countDown to 5

	        while (countUp <= 5 && countDown >= 1) {  // While loop runs as long as countUp is <= 5 and countDown is >= 1
	            System.out.println("Up: " + countUp + ", Down: " + countDown);  // Print the current values of countUp and countDown
	            countUp++;  // Increment the value of countUp by 1 in each iteration
	            countDown--;  // Decrement the value of countDown by 1 in each iteration
	        }  
	    } 
}
