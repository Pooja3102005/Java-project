package Sample;
import java.util.Scanner;
public class Rectperimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter width of rectangle");
		double width=sc.nextDouble();
		double area=length*width;
		double perimeter=2*(length+width);
		System.out.println("Area of rectangle:"+area);
		System.out.println("Perimeter of rectangle:"+perimeter);
		sc.close();
	}

}
