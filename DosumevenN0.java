package While;

import java.util.Scanner;

public class DosumevenN0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
	   
		int n =sc.nextInt();
		int sum=0;
		int i;
		do {
			i=n%10;
			if(i%2==0)
			{
				sum+=i;
			}
			n=n/10;
		}
		while(n>0);
		System.out.println("sum of even numbers:"+sum);
		sc.close();
	}

	}


