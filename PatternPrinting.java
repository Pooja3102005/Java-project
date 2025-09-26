package Codechef;

public class PatternPrinting {
	public static void main(String[] args) {
        int row = 1; // Initialize row counter
        int totalRows = 3; // Total number of rows
        int totalColumns = 4; // Total number of columns

        // Outer loop: Iterates for each row
        while (row <= totalRows) {
            int column = 1; // Initialize column counter for each row

            // Inner loop: Iterates for each column
            while (column <= totalColumns) {
                System.out.print("* "); // Print star and space
                column++; // Increment column counter
            }

            System.out.println(); // Move to the next line after printing columns
            row++; // Increment row counter
        }
    }
}
