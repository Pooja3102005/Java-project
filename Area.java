package Sample;
import java.util.Scanner;

public class Area {
	    private static Scanner sc;

		public static void main(String[] args) {
	        final double pi = 3.14;  
	        sc = new Scanner(System.in);

	        System.out.println("Enter the radius:");
	        double radius = sc.nextDouble();  
	        	        System.out.println("Circle Area: " + (pi * radius * radius));

	        	        System.out.println("Triangle Area: " + ((3.0 / 4) * radius * radius));
	    }
	}