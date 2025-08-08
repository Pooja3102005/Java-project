package While;

public class Dofactorial {

	public static void main(String[] args) {
		int n=5;
		int factorial=1;
		int i=1;
		do
		{
			factorial=factorial*i;
			i++;
		}
		while(i<=n);
		System.out.println("factorial of number is:"+factorial);
		
	}

}
