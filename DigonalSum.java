package Practical;
	import java.util.*;
	class DiagonalSum {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of rows and columns: ");
		        int n = sc.nextInt();

		        int[][] arr = new int[n][n];

		        System.out.println("Enter elements of matrix:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                arr[i][j] = sc.nextInt();
		            }
		        }

		        int sum = 0;
		        for (int i = 0; i < n; i++) {
		            sum += arr[i][i]; // main diagonal elements
		        }

		        System.out.println("\nSum of diagonal elements = " + sum);
		    }
		}