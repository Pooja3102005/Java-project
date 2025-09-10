package Codechef;

public class Ifgrade {
	public static void main(String[] args) {
        // Declare and initialize an integer variable
        int score = 75;

        // If-else if structure to determine the grade
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // This statement executes after the if-else if structure
        System.out.println("Grade evaluation completed.");
    }
}
