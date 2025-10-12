package Practical;
interface Square {
    int calculate(int n);
}

class Squaremain {
    public static void main(String[] args) {
        // Using lambda expression for functional interface
        Square c = (n) -> n * n;

        int num = 5;
        System.out.println("Square of " + num + " = " + c.calculate(num));
    }


}
