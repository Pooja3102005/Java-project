package Sample;
import java.util.Scanner;
public class Oprator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second  Number:");
		int num2=sc.nextInt();
		System.out.println("--arithmtic opertion--");
		System.out.println("Addition:"+(num1+num2));
		System.out.println("Substraction:"+(num1-num2));
		System.out.println("Multiplition:"+(num1*num2));
		System.out.println("Division:"+(num1/num2));
		System.out.println("Modulus:"+(num1%num2));
		System.out.println("greter:"+(num1>num2));
		System.out.println("less:"+(num1<num2));
		System.out.println("equal:"+(num1==num2));
		sc.close();
		
		
	}

}
