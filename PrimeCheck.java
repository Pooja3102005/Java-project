package Practical;
import java.util.Scanner;

//User-defined exception class
class NumberIsZeroException extends Exception {
 NumberIsZeroException(String msg) {
     super(msg);
 }
}

public class PrimeCheck {
 // Static method to check prime
 static boolean isPrime(int n) {
     if (n < 2)
         return false;
     for (int i = 2; i <= n / 2; i++) {
         if (n % i == 0)
             return false;
     }
     return true;
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Enter a number: ");
         int num = sc.nextInt();

         if (num == 0)
             throw new NumberIsZeroException("Number is 0");

         if (isPrime(num))
             System.out.println(num + " is a Prime number.");
         else
             System.out.println(num + " is Not a Prime number.");

     } catch (NumberIsZeroException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid input!");
     } finally {
         sc.close();
     }
 }
}
