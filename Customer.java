package Practical;
import java.util.*;

class Customer {
    String name, phone;
    void read(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
    }
    void display() {
        System.out.println("Name: " + name + "\nPhone: " + phone);
    }
}

class Depositor extends Customer {
    int accno; double balance;
    void read(Scanner sc) {
        super.read(sc);
        System.out.print("Enter Account No: ");
        accno = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }
    void display() {
        super.display();
        System.out.println("Account No: " + accno + "\nBalance: " + balance);
    }
}

class Borrower extends Depositor {
    int loan_no; double loan_amt;
    void read(Scanner sc) {
        super.read(sc);
        System.out.print("Enter Loan No: ");
        loan_no = sc.nextInt();
        System.out.print("Enter Loan Amount: ");
        loan_amt = sc.nextDouble();
    }
    void display() {
        super.display();
        System.out.println("Loan No: " + loan_no + "\nLoan Amount: " + loan_amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        Borrower[] b = new Borrower[n];

        for (int i = 0; i < n; i++) {
            b[i] = new Borrower();
            System.out.println("\nEnter details of Customer " + (i + 1));
            b[i].read(sc);
        }

        System.out.println("\n--- Customer Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1));
            b[i].display();
        }
    }
}
