package Practical;
abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class OfficeStaff extends Staff {
    String department;

    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void display() {
        System.out.println(id + " " + name + " " + department);
    }
}
public class Staffmain {
    public static void main(String[] args) {
        OfficeStaff s1 = new OfficeStaff(1, "Pooja", "HR");
        OfficeStaff s2 = new OfficeStaff(2, "Rutu", "Accounts");

        s1.display();
        s2.display();
    }
}
