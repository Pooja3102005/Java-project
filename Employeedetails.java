package Demoo;

public class Employeedetails {
	
	    private int empId;
	    private String empName;
	    private String empDesignation;
	    private double empSal;

	    public Employeedetails(int empId, String empName, String empDesignation, double empSal) {
	        this.empId = empId;
	        this.empName = empName;
	        this.empDesignation = empDesignation;
	        this.empSal = empSal;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empId=" + empId +
	                ", empName='" + empName + '\'' +
	                ", empDesignation='" + empDesignation + '\'' +
	                ", empSal=" + empSal +
	                '}';
	    }

	    public static void main(String[] args) {
	        Employeedetails employee1 = new Employeedetails(101, "John Doe", "Manager", 50000.0);
	        Employeedetails employee2 = new Employeedetails(102, "Jane Smith", "Developer", 45000.0);

	        System.out.println(employee1);
	        System.out.println(employee2);
	    }
	}

