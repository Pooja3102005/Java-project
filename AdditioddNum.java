package Codechef;
import java.util.Scanner;
public class AdditioddNum {

 // The main method serves as the entry point for the program.
 public static void main(String[] args) {
     
     // write your code here
     Scanner sc = new Scanner(System.in);
     int start = sc.nextInt();
     int end = sc.nextInt();
     int limit = sc.nextInt();
     
     while (start <= end) {
         if (start % 2 !=0) {
             System.out.println("Addition Table for " + start + ":");
             int addend = 1;
             while (addend <= limit) {
                 System.out.println(start + " + " + addend + " = " + (start + addend));
                 addend++;
             }
         } 
         start++;
     }
     sc.close();
 }


}
