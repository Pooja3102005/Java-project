package Codechef;
import java.util.*;
public class Evennum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Take input of n from user
        int n = sc.nextInt();
        
        int number = 2; // Starting with the first even number
        
        System.out.println("Even numbers from 2 to " + n + ":");
        
        while (number <= n) {  // Continue loop until number is less than or equal to n
            System.out.println(number);
             number += 2;
        }
    }
}




