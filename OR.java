package Codechef;


	import java.util.*;
	public class OR {
	    public static void main(String[] args) {
	        // Declare and initialize temperature and rain status
	        int temperature = 35;
	        boolean isRaining = true;

	        // Check if the temperature is greater than 30 OR if it is raining
	        if (temperature > 30 || isRaining) {
	            // If either condition is true, advise to stay indoors
	            System.out.println("Stay indoors today.");
	        } else {
	            // If both conditions are false, it's safe to go outside
	            System.out.println("You can go outside.");
	        }

	        // Print a final message indicating the completion of the weather check
	        System.out.println("Weather advisory check completed.");
	    }
	}


