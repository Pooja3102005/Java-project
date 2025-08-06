package Demoo;

import java.util.Scanner;

public class Swevenodd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		switch(num%2) 
		{
		case 0:System.out.println("the number is even");
		break;
		case 1:System.out.println("the number is odd");
		break;
		
		}
		sc.close();
	}

}
