package Codechef;
import java.util.Scanner; // Import Scanner class for user input

public class SwitchMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Display menu options
        System.out.println("Welcome to the Restaurant! Please select a dish:");
        System.out.println("1. Pasta");
        System.out.println("2. Burger");
        System.out.println("3. Salad");
        System.out.println("4. Dessert");

        // Read user input for menu choice
        int choice = scanner.nextInt();

        String dish; // Variable to store the selected dish

        // Determine the dish based on the menu selection using switch statement
        switch (choice) {
           case 1:
               dish = "Pasta";
               break;
            case 2:
                dish = "Burger";
                break;
            case 3:
                dish = "Salad";
                break;
            case 4:
                dish = "Dessert";
                break;
            default:
                dish = "Invalid choice. please select a valid menu option.";
                break;
        }
    
        // Output the selected dish or error message
        System.out.println("You selected: " + dish);

        scanner.close(); // Close the Scanner object
    }
}



