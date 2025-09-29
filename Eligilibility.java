package Codechef;
import java.util.Scanner;
public class Eligilibility {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input for purchase amount
	          int purchaseAmount = scanner.nextInt();

	        // Checking discount eligibility
	           if (purchaseAmount >= 1000) {
	               System.out.println("Congratulation! You are eligible for a discount.");
	            }
	        scanner.close();
	    }
}
