package Codechef;
import java.util.Scanner;
public class LeftAligned {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input and validate
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Step 2: Generate the pattern using while loops
          int row =1;
          while (row <=n) {
              int num = 1;
              while (num <=row) {
            	  System.out.println(num + " ");

                  num++;
              }
              System.out.println();
              row++;
          }
         

    }


}
