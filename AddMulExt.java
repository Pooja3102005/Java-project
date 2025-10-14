package Practical;
import java.util.Scanner;
public class AddMulExt {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int[][] A = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	        int[][] B = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
	        int[][] result = new int[3][3];
	        int choice;

	        do {
	            System.out.println("\n1. Addition\n2. Multiplication\n3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scan.nextInt();

	            switch (choice) {
	                case 1:
	                    for (int i = 0; i < 3; i++)
	                        for (int j = 0; j < 3; j++)
	                            result[i][j] = A[i][j] + B[i][j];
	                    System.out.println("Sum:");
	                    print(result);
	                    break;

	                case 2:
	                    for (int i = 0; i < 3; i++)
	                        for (int j = 0; j < 3; j++) {
	                            result[i][j] = 0;
	                            for (int k = 0; k < 3; k++)
	                                result[i][j] += A[i][k] * B[k][j];
	                        }
	                    System.out.println("Product:");
	                    print(result);
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 3);
	        scan.close();
	    }

	    static void print(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row)
	                System.out.print(val + "\t");
	            System.out.println();
	        }
	    }
	}
