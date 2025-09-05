package Codechef;


	import java.util.*;
	// This class demonstrates the use of statements and semicolons in Java.
	public class Lessthanequal {
	    // The main method serves as the entry point for the program.
	    public static void main(String[] args) {
	        
	        // write your code here
	        Scanner sc = new Scanner(System.in);
	        int luggageWeight = sc.nextInt();
	        int maxWeight = 20;
	        if (luggageWeight <= maxWeight) {
	            System.out.println("Your luggage is within the allowed limit.");
	            
	        }
	        else{
	            int excessWeight = luggageWeight - maxWeight;
	            System.out.println("Your luggage exceeds the limit by " + excessWeight + " kg. Additional charges may apply.");
	            
	        }
	        System.out.println("Luggage check completed.");
	    }
	}

