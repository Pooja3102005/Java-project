package While;

import java.util.Scanner;

public class DoMultable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
	   
		int n =sc.nextInt();
		int i=1;
		do {
			System.out.println(n*i);
			i++;
		}
		while(i<=10);
			sc.close();
	}

}
