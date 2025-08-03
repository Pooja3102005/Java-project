package Sample;
import java.util.Scanner;
public class Bank {
static String Bankname="IDFC";
double balance;
void showbankname() {
	System.out.println("Bankname:"+Bankname);
}
void displaybalance() {
	boolean balance=true;
	System.out.println("Current balance:"+balance);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank b1=new Bank();
	System.out.print("Enter your balance");
	b1.balance=sc.nextDouble();
	b1.displaybalance();
	sc.close();
	
	
}
}
