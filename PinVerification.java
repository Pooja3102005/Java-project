package Codechef;
import java.util.Scanner;

public class PinVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        int correctPIN = 1234; // Define the correct PIN
        boolean isVerified = false; // Flag to control the loop

        // Loop continues until the correct PIN is entered
            while (!isVerified) {
                int userPIN = scanner.nextInt();
                
                if (userPIN == correctPIN) {
                    isVerified = true;
                    System.out.println("Access granted!");
                } else {
                    System.out.println("Invalid PIN. try again.");
                }
            }


        scanner.close(); // Close the scanner to prevent resource leaks
    }


}
