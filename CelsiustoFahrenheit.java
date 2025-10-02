package Codechef;
import java.util.Scanner;
public class CelsiustoFahrenheit {
	public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // The value is expected to be of type double
          double celsius = scanner.nextDouble();

        // Converting the Celsius temperature to Fahrenheit using the formula: (C * 9/5) + 32
           double Fahrenheit = (celsius *9/5) +32;

        // Displaying the converted Fahrenheit temperature
           System.out.println("Temprature in Fahrenheit: " +Fahrenheit);

        // Closing the Scanner object to release system resources and prevent memory leaks
        scanner.close();
    }
}
