package Demoo;
import java.util.Scanner;
public class Swgrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char A-E");
		char alph=sc.next().charAt(0);
		switch (alph)
		{
		case 'A':System.out.println("Excellent");
		break;
		case 'B':System.out.println("Good");
		break;
		case 'C':System.out.println("average");
		break;
		case 'D':System.out.println("Poor");
		break;
		case 'E':System.out.println("fail");
		break;
		default:System.out.println("invalid input");
		}
		sc.close();
	}

}
