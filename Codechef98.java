package Codechef;
import java.util.Scanner;
public class Codechef98 {
	public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a float value
        float floatValue = scanner.nextFloat();  // Example: 45.67
        System.out.println("You entered the float: " + floatValue);

        // Prompting the user to enter a double value
        double doubleValue = scanner.nextDouble();  // Example: 123.456789
        System.out.println("You entered the double: " + doubleValue);

        // Prompting the user to enter a boolean value (true/false)
        boolean booleanValue = scanner.nextBoolean();   // Example: true
        System.out.println("You entered the boolean: " + booleanValue);

        // Closing the Scanner object to free resources
        scanner.close();
    }
}
