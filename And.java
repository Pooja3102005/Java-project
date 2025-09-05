package Codechef;
import java.util.*;

public class And {

    public static void main(String[] args) {
        // Declare temperature and humidity variables
        int temperature = 25;
        int humidity = 60;

        // Check if both conditions are true using the AND (&&) operator
        if (temperature > 20 && humidity < 70) {
            // If both conditions are met, print that the weather is pleasant
            System.out.println("The weather is pleasant.");
        } else {
            // If either condition is false, print that the weather is not ideal
            System.out.println("The weather is not ideal.");
        }

        // Print a message indicating that the weather check is complete
        System.out.println("Weather check completed.");
    }

}
