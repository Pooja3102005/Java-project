package Codechef;
import java.util.Scanner;

public class SumOddumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        
        int start = scanner.nextInt(); // Read start value
        int end = scanner.nextInt(); // Read end value
        
        // Variable to store sum of odd numbers
        int sum = 0;
        
        // Loop from start to end
          for (int i = start; i <= end; i++) {
              if (i % 2 != 0) {
                  sum += i;
              }
          }
        
        // Print the total sum of odd numbers
        System.out.println("Sum of odd numbers: " + sum);
        
        scanner.close(); // Close the scanner
    }
}
