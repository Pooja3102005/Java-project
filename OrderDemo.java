package Practical;
import java.util.Scanner;


abstract class Order {
  int id; String desc;
  abstract void accept();
  abstract void display();
}

class PurchaseOrder extends Order {
  String cust;
  void accept() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter PO id, desc, customer: ");
    id = sc.nextInt(); 
    sc.nextLine();
    desc = sc.nextLine(); 
    cust = sc.nextLine();
  }
  void display() {
    System.out.println("PO Id:"+id+" Desc:"+desc+" Customer:"+cust);
  }
}

class SalesOrder extends Order {
  String vendor;
  void accept() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter SO id, desc, vendor: ");
    id = sc.nextInt(); 
    sc.nextLine();
    desc = sc.nextLine(); 
    vendor = sc.nextLine();
  }
  void display() {
    System.out.println("SO Id:"+id+" Desc:"+desc+" Vendor:"+vendor);
  }
}

class OrderDemo {
  public static void main(String a[]) {
    PurchaseOrder p = new PurchaseOrder();
    SalesOrder s = new SalesOrder();
    p.accept(); 
    s.accept();
    System.out.println("\n---Purchase Order---");
    p.display();
    System.out.println("\n---Sales Order---");
    s.display();
  }
}