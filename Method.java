package Sample;

public class Method {
void  user() {
	System.out.println("Welcome");
}
int square(int num) {
	return num*num;
}
void showdetils(String name, int age) {
	System.out.println("age:"+age);
	System.out.println("name:"+name);
}
double getpi() {
	return 3.14;
}
	public static void main(String[] args) {
		Method m1=new Method();
		m1.user();
		int result=m1.square(10);
		System.out.println("square of 5 is:"+result);
		m1.showdetils("pooja",22);
		double pivalue=m1.getpi();
		System.out.println("Value of pi is:"+pivalue);
		
	}

}
