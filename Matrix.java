package Codechef;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        // Outer loop for rows
          for ( int i = 1; i <= size; i++) {
              for (int j = 1; j <= size; j++){
                  if (i == j) {
                      System.out.println("  -  ");
                      continue;
                  }
                  System.out.println(" " + (j) + " ");
              }
              System.out.println();
          }

        // Print completion message
        System.out.println("Matrix with non-equal pairs completed.");
    }


}
