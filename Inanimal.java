package Inheritance;
class Animals{
	int Animalseye =2;
	String Animalscolor="Grey";
	

	void display()
	{
		System.out.println("Animal eye are:"+ Animalseye);
		System.out.println("Animal color is:"+ Animalscolor);
		
	}
}
class Aquatic extends Animals{
	
	void display1()
	{
	System.out.println("I am fish");
	}
}
class Reptilies extends Animals{
	
	void display2()
	{
	System.out.println("I am Snake");
	}
	
} 
class Herbivorous extends Animals{
	
	void display3()
	{
	System.out.println("I am Cow");
	}
}
class Fish extends Aquatic{
	
}
class Snake extends Reptilies {
	
}
class Cow extends Herbivorous{
	
}
public class Inanimal {
	public static void main(String[] args)
	{
      Fish f1 = new Fish();
      f1.display();
      f1.display1();
      
      Snake s1= new Snake();
      s1.display();
      s1.display2();
      
      Cow c1 = new Cow();
      c1.display();
      c1.display3();
	}

}
