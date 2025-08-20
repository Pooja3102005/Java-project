package Inheritance;
class SMBST{
	String collegename = "Smbst";
	String collegeaddress = "Sangamner";
	int contactnumber = 1237446;
	int establishyear = 1990;
	String collegeemail = "Smbstcollege@mail.com";
	
	void display() {
		System.out.println("College Name:"+collegename);
		System.out.println("College Address:"+collegeaddress);
		System.out.println("College Contact No.:"+contactnumber);
		System.out.println("College Estsblish Year:"+establishyear);
		System.out.println("College Mail Id:"+collegeemail);
		
	}
}

class Science extends SMBST{
	void display1(){
		System.out.println("Department: Computer Science");
	}
}
class Bcs extends Science{
	
}
class Bca extends Science{
	
}
class Bscchem extends Science{
	
}

class Commerce extends SMBST{
	void display2(){
		System.out.println("Department: Commerce");
	}
}
class Bcom extends Commerce{
	
}
class BEcon extends Commerce{
	
}
class BAF extends Commerce{
	
}

class Arts extends SMBST{
	void display3(){
		System.out.println("Department: Arts");
	}
}
class BA extends Arts{
	
}
class BBA extends Arts{
	
}


public class College {
	public static void main(String[] args)
	{
		Bcs b1 = new Bcs();
		b1.display();
		b1.display1();
		
		Bca b2 = new Bca();
		b2.display();
		b2.display1();
		
		Bscchem b3= new Bscchem();
		b3.display();
		b3.display1();
		
		Bcom c1 = new Bcom();
		c1.display();
		c1.display2();
		
		BEcon c2 = new BEcon();
		c2.display();
		c2.display2();
		
		BAF c3 = new BAF();
		c3.display();
		c3.display2();
		
		BA a1 = new BA();
		a1.display();
		a1.display3();
		
		BBA a2 =new BBA();
		a2.display();
		a2.display3();
	}
	
}
