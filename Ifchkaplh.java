package Demoo;
import java.util.Scanner;
public class Ifchkaplh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter   a alphabate:");
		char alph=sc.next().charAt(0);
		if(alph>='A'  && alph<='Z')
		{
			System.out.println("Is the uppercase letter");
		}
		else  if(alph>='a'  && alph<='z')
		{
			System.out.println("Is the lowercase letter");
		}
		else {
			System.out.println("Is not alphabate");
		}
		sc.close();
	}

}
