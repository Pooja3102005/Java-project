package Codechef;

public class AccumulatorPattern {
	public static void main(String[] args) {
        int n = 20;       // Sum numbers from 1 to 20
        int total = 0;    // Initialize accumulator
        int counter = 1;  // Initialize counter

        while (counter <= n) { // Loop runs from 1 to n
            total += counter;  // Add the current number to total
            counter++;         // Increment counter
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + total);
    }
}
