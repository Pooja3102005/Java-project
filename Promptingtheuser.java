package Codechef;
import java.util.Scanner;
public class Promptingtheuser {
	public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a single word and reading the input
        // 
        String word = scanner.next(); // Example input: "Hello"
        System.out.println("You entered: " + word); 

        // Consuming the newline character left in the buffer after reading the word
        scanner.nextLine(); // Ensures the buffer is clear for the next line of input

        // Prompting the user to enter a full sentence and reading the input
        String sentence = scanner.nextLine(); // Example input: "This is a sample sentence."
        
        System.out.println("You entered: " + sentence); 

        // Prompting the user to enter a single character
        char character = scanner.next().charAt(0); // Example input: "A"
        System.out.println("You entered: " + character); 

        // Closing the Scanner object to release system resources
        scanner.close();
    }
}
