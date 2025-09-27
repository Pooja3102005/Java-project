package Codechef;

public class NestedWhile {
	public static void main(String[] args) {
		
	
	   int outer = 1 ; // Initialize outer counter (rows)

       while (outer <= 3) { // Outer loop runs for 3 rows
           int inner = 1; // Initialize inner counter (columns)

           while (inner <= 3) { // Inner loop runs for 3 columns
               System.out.print("(" + outer + "," + inner + ") "); // Print cell coordinates
               inner++; // Increment inner counter
           }

           System.out.println(); // Newline after completing a row
           outer++; // Increment outer counter
       }
   }
}
