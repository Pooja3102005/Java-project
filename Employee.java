package Sample;

import java.util.Scanner;

public class Employee {
	static String companyname ="flipcart";
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
		System.out.println(" Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter Empoloyee Id:");
		int id=sc.nextInt();
		System.out.println(" Employee Salary:");
		double salary=sc.nextDouble();
		Employee e1= new Employee(name, id, salary );
		e1.displayDetails();
		sc.close();
	}
}

