package Codechef;

public class FlagControl {
	public static void main(String[] args) {
        boolean flag = true; // Initialize flag variable
        int a = 4, b = 10;   // Initialize values

        // Flag-controlled loop: runs as long as flag is true
        while (flag) {
            System.out.println("Current value of a: " + a);

            // Check if 'a' has reached 'b'
            if (a == b) { 
                flag = false; // Set flag to false to exit the loop
            }

            a++; // Increment 'a' in each iteration
        }

        // Print final message after loop termination
        System.out.println("Loop terminated as a reached b.");
    }
}
