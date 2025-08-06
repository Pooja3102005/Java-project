package Demoo;
import java.util.Scanner;
public class Swarthoper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operator");
		char arthoper=sc.next().charAt(0);
		switch (arthoper)
		{
		case '+':System.out.println("Addition");
		break;
		case '-':System.out.println("Substraction");
		break;
		case '*':System.out.println("Multiplication");
		break;
		case '/':System.out.println("Division");
		break;
		}
		sc.close();
	}

}
