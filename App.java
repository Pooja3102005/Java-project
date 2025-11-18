package Demoo;

import java.util.Scanner;


interface CubeCalculator {
    double calculateCube(double number);
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its cube: ");
        double number = scanner.nextDouble();

        CubeCalculator cubeCalc = (n) -> n * n * n;

        double cube = cubeCalc.calculateCube(number);
        System.out.printf("The cube of %.2f is %.2f%n", number, cube);

        scanner.close();
    }
}
