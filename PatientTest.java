package Practical;

class CovidEx extends Exception {
    CovidEx(String msg) { super(msg); }
}
class Pat {
    String n;
    int age, hrct;
    double oxy;
    Pat(String n, int age, double oxy, int hrct) {
        this.n = n;
        this.age = age;
        this.oxy = oxy;
        this.hrct = hrct;
    }
    void check() throws CovidEx {
        if (oxy < 95 || hrct > 10)
            throw new CovidEx("Covid Positive (+) - Needs Hospitalization");
        show();
    }
    void show() {
        System.out.println("Name: " + n);
        System.out.println("Age: " + age);
        System.out.println("O2: " + oxy);
        System.out.println("HRCT: " + hrct);
    }
}
public class PatientTest {
    public static void main(String[] a) {
        Pat p = new Pat("John", 50, 100.5, 7);
        try {
            p.check();
        } catch (CovidEx e) {
            System.out.println(e.getMessage());
        }
    }
}
