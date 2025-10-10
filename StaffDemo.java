package Demo2;
abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void display();
}

class OfficeStaff extends Staff {
    String department;

    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class StaffDemo {
    public static void main(String args[]) {
        OfficeStaff s1 = new OfficeStaff(1, "Ravi", "HR");
        OfficeStaff s2 = new OfficeStaff(2, "Priya", "Accounts");

        s1.display();
        s2.display();
    }


}
