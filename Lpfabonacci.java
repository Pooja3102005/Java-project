package Demoo;

public class Lpfabonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int c;
		System.out.println("Fibonacci Series:"+a);
		System.out.println("Fibonacci Series:"+b);
		for(int i=1;i<=n-2;i++)
		{
		c=a+b;
	    System.out.println("Fibonacci Series:"+c);
	    a=b;
	    b=c;
		}
	}

}
