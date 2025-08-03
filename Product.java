package Sample;
import java.util.Scanner;
public class Product {
    int id;
    String name;
    double price;
        Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }
       
}
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        Product p = new Product(id, name, price);
        p.show();
    }
}

