package Practical;
import java.io.*;
public class StudentSml {
	    int rollno;
	    String name;
	    String className;
	    float per;
	    void accept() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Roll Number: ");
	        rollno = Integer.parseInt(br.readLine());
	        System.out.print("Enter Name: ");
	        name = br.readLine();
	        System.out.print("Enter Class: ");
	        className = br.readLine();
	        System.out.print("Enter Percentage: ");
	        per = Float.parseFloat(br.readLine());
	    }
	    void display() {
	        System.out.println("\n--- Student Details ---");
	        System.out.println("Roll No: " + rollno);
	        System.out.println("Name: " + name);
	        System.out.println("Class: " + className);
	        System.out.println("Percentage: " + per);
	    }
	    public static void main(String[] args) throws IOException {
	        StudentSml s = new StudentSml();
	        s.accept();
	        s.display();
	    }
	}
