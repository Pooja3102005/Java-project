package Inheritance;
     
class Main{
	void CalculateArea() {
		System.out.println("Area not defined");
	}
}
class Circle extends Main{
	double radius;
	Circle(double r){
		radius =r;
	}
	void CalculateArea() {
		System.out.println("Area of circle:" +(3.14 *radius *radius));
	}
}
class Square extends Main{
	double side;
	Square(double s ){
	  side=s;
	}

   void CalculateArea() {
	  System.out.println("Area of square:" +(side*side));
}
}
class Traingle extends Main{
	double base,height;
	Traingle(double b, double h){
		base = b;
		height = h;
	}
	void CalculateArea() {
		System.out.println("Area of Traingle:"+(0.5*base*height));
	}
}

public class Shape {
public static void main(String[] args) {
	Main c=new Circle(5);
	Main s=new Square(4);
	Main t=new Traingle(6,3);
	
	c.CalculateArea();
	s.CalculateArea();
	t.CalculateArea();
}
}
