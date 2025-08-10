package While;

public class Fabonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int c;
		int i=1;
		while(i<=n-2)
		{
			System.out.println("Fibonacci Series:"+a);
			System.out.println("Fibonacci Series:"+b);
			i++;
			{
				c=a+b;
			    System.out.println("Fibonacci Series:"+c);
			    a=b;
			    b=c;
			}
		}
	}

}
