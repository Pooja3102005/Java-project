package Demoo;
import java.util.Scanner;
public class Ifvote {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE FOR VOTE");
		}
		else {
			System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE");
		}		
		sc.close();
	

	}

}
