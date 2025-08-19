package Inheritance;
class Cars{     //Parent class/ Super class / Base class
	int CarNo = 4050;
	int CarSpeed = 50;
	String CarColor ="Red";
	
	void Display()
	{
		System.out.println("Car Color is "+CarColor);
		System.out.println("Car Number is "+CarNo);
		System.out.println("Car Speed is "+CarSpeed +" km/hr");
	}
}
class Bolero extends Cars { //Child class / Derived class / Sub Class
	void display1()
	{
		System.out.println("I am Bolero");
	}
}
class Fortuner extends Bolero{
}
public class Demo {
	public static void main(String[] args)
	{
	    Fortuner f1 = new Fortuner();
	    f1.Display();
	    f1.display1();
	    }
	}
