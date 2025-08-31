package Codechef;

public class Codechef57 {
	 public static void main(String[] args) {
	        // Step 1: Define the credit score of the applicant
	        int creditScore = 650;

	        // Step 2: Define the monthly income of the applicant
	        double monthlyIncome = 55000;

	        // Step 3: Evaluate the loan eligibility using the OR operator
	        // The applicant is eligible if their credit score is 700 or higher,
	        // OR their monthly income is 50,000 or higher
	          boolean iseligible = creditScore >=700 || monthlyIncome >=3000;
	          
	        // Step 4: Display the loan eligibility result
	        System.out.println("Eligible for Loan: " +iseligible);
	    }
}
