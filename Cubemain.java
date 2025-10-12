package Practical;
interface Cube {
    int calculate(int n);
}

class Cubemain {
    public static void main(String[] args) {
        // Using lambda expression for functional interface
        Cube c = (n) -> n * n * n;

        int num = 5;
        System.out.println("Cube of " + num + " = " + c.calculate(num));
    }


}
