package Codechef;

public class Ifcheackno {
	public static void main(String[] args) {
        // Declare an integer variable and assign a value
        int number = 6;

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");

            // Check if the number is even
            if (number % 2 == 0) {
                System.out.println("The number is also even.");
            }
        }

        // This statement runs regardless of the if condition
        System.out.println("Number check completed.");
    }
}
