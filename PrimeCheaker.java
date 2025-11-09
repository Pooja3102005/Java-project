package Practical;

import java.util.Scanner;

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class PrimeCheaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            checkZero(number);
            System.out.println(number + (isPrime(number) ? " is a prime number." : " is not a prime number."));
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkZero(int number) throws ZeroException {
        if (number == 0) {
            throw new ZeroException("Number is 0");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
