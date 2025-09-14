package Codechef;

public class Ternaryoperator {
	 public static void main(String[] args) {
	        // Declaring a variable for the minimum passing score
	        int passingScore = 50;
	         // Declaring a variable for the student's score
	        int studentScore = 60;

	        // Using the ternary operator to check if the student's score is greater than or equal to the passing score
	        String result = (studentScore >= passingScore) ? "Congratulations! You passed the test." : "You did not pass. Better luck next time!";
	        
	        // Print the result
	        System.out.println(result);

	        // This statement executes regardless of the condition
	        System.out.println("Score evaluation completed.");
	    }
}
