package While;

public class Startriangle {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.println("");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print('*');
			}
			System.out.println("");
	}

}
}