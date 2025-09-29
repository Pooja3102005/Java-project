package Codechef;
import java.util.Scanner; 

public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        int number; // Declare a variable to store the user input

        // Infinite loop to repeatedly prompt user for input
          while (true) {
              number = scanner.nextInt();
              
              if (number % 3 == 0 && number % 5 == 0) {
                  break;
              } else {
                  System.out.println("Invalid input! Enter a number divisible by both 3 and 5.");
              }
          }
         
        // Print the valid number that satisfies the condition
        System.out.println("Valid input! " + number + " is divisible by both 3 and 5.");
        
        scanner.close(); // Close the scanner to free system resources
    }


}
