package Codechef;

public class Codechef43 {
	public static void main(String[] args) {
        int a = 5, b = 5;

        int result1 = ++a * 2; // Pre-increment: a is incremented first, then multiplied
        int result2 = b++ * 2; // Post-increment: b is used first, then incremented

        System.out.println("Pre-increment result: " + result1); // Output: 12
        System.out.println("Post-increment result: " + result2); // Output: 10
        System.out.println("Final value of a: " + a); // Output: 6
        System.out.println("Final value of b: " + b); // Output: 6
    }
}
