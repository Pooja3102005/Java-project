package Codechef;
import java.util.Scanner;
public class Codechef99 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create Scanner object

	        String name = scanner.nextLine(); // Example input: Alex Johnson 
	        int age = scanner.nextInt();      // Example input: 22 
	        double height = scanner.nextDouble();  // Example input: 1.75  
	        boolean isStudent = scanner.nextBoolean(); // Example input: true 

	        // Print user details
	        System.out.println("\nYour details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Height: " + height + " meters");
	        System.out.println("Student: " + isStudent);

	        scanner.close(); // Close Scanner
	    }
}
