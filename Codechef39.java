package Codechef;

public class Codechef39 {
	public static void main(String[] args) {
        int a, b, c;
        a = b = c = 100; // Chained assignment

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        // Changing 1 variable value will not change other variable values
        b=10;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
