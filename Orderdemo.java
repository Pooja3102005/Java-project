package Demoo;
import java.util.Scanner;

abstract class Order {
	int id;
	String description;

	abstract void accept();

	abstract void display();
}

class PurchaseOrder extends Order {
	String customerName;

	void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Purchase Order ID: ");
		id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter Purchase Order Description: ");
		description = scanner.nextLine();
		System.out.print("Enter Customer Name: ");
		customerName = scanner.nextLine();
	}

	void display() {
		System.out.println("Purchase Order ID: " + id);
		System.out.println("Description: " + description);
		System.out.println("Customer Name: " + customerName);
	}
}

class SalesOrder extends Order {
	String vendorName;

	void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Sales Order ID: ");
		id = sc.nextInt();
		sc.nextLine(); // Consume newline
		System.out.print("Enter Sales Order Description: ");
		description = sc.nextLine();
		System.out.print("Enter Vendor Name: ");
		vendorName = sc.nextLine();
	}

	void display() {
		System.out.println("Sales Order ID: " + id);
		System.out.println("Description: " + description);
		System.out.println("Vendor Name: " + vendorName);
	}
}

public class Orderdemo {
	public static void main(String[] args) {
		PurchaseOrder[] purchaseOrders = new PurchaseOrder[2];
		SalesOrder[] salesOrders = new SalesOrder[2];

		for (int i = 0; i < 2; i++) {
			purchaseOrders[i] = new PurchaseOrder();
			purchaseOrders[i].accept();

			salesOrders[i] = new SalesOrder();
			salesOrders[i].accept();
		}

		System.out.println("\nPurchase Orders:");
		for (PurchaseOrder purchaseOrder : purchaseOrders) {
			purchaseOrder.display();
			System.out.println();
		}

		System.out.println("\nSales Orders:");
		for (SalesOrder salesOrder : salesOrders) {
			salesOrder.display();
			System.out.println();
		}
	}


}
