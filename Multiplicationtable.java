package Codechef;
import java.util.Scanner;
public class Multiplicationtable {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number = scanner.nextInt();  

        int multiplier = 1;    

        
        while (multiplier <= 10) {  
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));  
            multiplier++;    
        }
        
        scanner.close();      }
}
