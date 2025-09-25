package Codechef;
import java.util.Scanner;

public class fabonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of terms
        int terms = scanner.nextInt();

        int first = 0, second = 1; // First two Fibonacci numbers
        int count = 2; // Counter to track the number of terms generated

        // Print first two numbers of the Fibonacci sequence
         System.out.println("Fibonacci Series: " + first + " " + second + " ");

        // Use while loop to generate the remaining Fibonacci numbers

       while (count < terms) {
           int next = first + second;
           System.out.println(next + " ");
           first = second;
           second = next;
           count++;
       }
        scanner.close(); // Close the scanner
    }


}
