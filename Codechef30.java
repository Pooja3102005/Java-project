package Codechef;

public class Codechef30 {
	public static void main(String[] args) {
        // Performing floating-point division
        double result1 = 7.0 / 2; // One operand is a floating-point number.
        double result2 = 7.5 / 2.0; // Both operands are floating-point numbers.
        int result3 = (int)(7.5 / 2); // The division of these two operands results in 3.75, but since the result is stored as an int, it is explicitly cast, rounding down to 3.

        // Printing the result
        System.out.println("Floating-point division result: " + result1);
        System.out.println("Floating-point division result: " + result2);
        System.out.println("Floating-point division result: " + result3);
    }
}
