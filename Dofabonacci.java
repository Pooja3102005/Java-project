package While;

public class Dofabonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int c;
		int i=1;
		do
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
			while(i<=n-2);
	
	}
}

