package Sample;
import java.util.Scanner;
public class Calculation {	
	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter First Number:");
		 int a=s1.nextInt();
		 System.out.println("Enter Second Number:");
		 int b=s1.nextInt();
		 System.out.println("Addition:"+(a+b));
		 System.out.println("Substraction:"+(a-b));
		 System.out.println("Multiplition:"+(a*b));
		 System.out.println("Division:"+(a/b));
		 s1.close();
	}

}
