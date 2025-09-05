package Codechef;
import java.util.*;
//This class demonstrates the use of statements and semicolons in Java.
public class Greaterthanequal {
 // The main method serves as the entry point for the program.
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     int minSeniorAge = 60;
     if(age >= minSeniorAge) {
         System.out.println("You are eligible for a senior citizen discount!");
         System.out.println("Enjoy your discounted movie ticket.");
         
     }
     else {
         int yearsLeft = minSeniorAge - age;
         System.out.println("You are not eligible for a senior citizen discount.");
         System.out.println("You need to wait " + yearsLeft + " more years to quality.");
     }
     // write your code here
 }
}
