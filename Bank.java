package Practical;
import java.util.*;
public class Bank {
    String name;
    int acc;
    double bal;
    Bank(String n, int a, double b) {
        name = n;
        acc = a;
        bal = b;
    }
    void dep(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
    }
    void wd(double amt) {
        if (amt > bal)
            System.out.println("Insufficient balance!");
        else {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }
    void show() {
        System.out.println("\nName: " + name + "\nAcc No: " + acc + "\nBalance: " + bal);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String n = s.nextLine();
        System.out.print("Acc No: ");
        int a = s.nextInt();
        System.out.print("Balance: ");
        double b = s.nextDouble();
        
        Bank b1 = new Bank(n, a, b);
        System.out.print("Deposit: ");
        b1.dep(s.nextDouble());
        System.out.print("Withdraw: ");
        b1.wd(s.nextDouble());
        b1.show();
    }
}
