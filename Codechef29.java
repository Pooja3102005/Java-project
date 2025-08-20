package Codechef;

public class Codechef29 {
	 public static void main(String[] args) {
	        // Declare and initialize integer variables
	        int num1 = 20;  // Dividend
	        int num2 = 4;   // Divisor
	        int num3 = 3;   // Divisor

	        // Perform division and store the result
	        int quotient1 = num1 / num2;  // 20 / 4
	        int quotient2 = num1 / num3;  // 20 / 3 -> It results in 6 instead of 3.333...

	        double quotient3 = num1 / num3;  // 20/3 -> It results in 6.0 because the value is stored as floating point after we have performed division with 2 integer values

	        
	        System.out.println("Quotient1: " + quotient1);
	        System.out.println("Quotient2: " + quotient2);
	        System.out.println("Quotient3: " + quotient3);
	    }
}
