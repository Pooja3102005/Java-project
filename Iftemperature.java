package Codechef;
import java.util.Scanner; // Import Scanner class to take input from the user

public class Iftemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Read user input and store it in the 'temperature' variable
            int temperature = scanner.nextInt();

        // Check if the temperature is above 30
            if(temperature > 30) {
                System.out.println("It's hot outside! Stay hydrated.");
            }


        // Use one 'else if' to check if the temperature is between 10 and 30 (inclusive)
            else if (temperature >= 10) {
                System.out.println("The weather is moderate. Enjoy your day!");
            }


        // Use 'else' for all other conditions (temperature below 10)
            else {
                System.out.println("It's cold outside! Wear warm clothes.");
            }



        scanner.close(); // Close the Scanner object to free up resources
    }

}
