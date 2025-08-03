package Sample;
public class Empldet {
void start() {
	System.out.println("Car is starting--");
}
static void showcompanyname() {
	System.out.println("company name:Tata Motors");
}
	public static void main(String[] args) {
		Empldet.showcompanyname();
		Empldet mycar=new Empldet();
		mycar.start();
		}

}
