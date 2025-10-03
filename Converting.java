package Codechef;

public class Converting {
public static void main(String[] args) {
        
        // Example 1: Converting String to int
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("The integer value is: " + num);
        
        // Example 2: Converting String to double
        String piStr = "3.14";
        double pi = Double.parseDouble(piStr);
        System.out.println("The value of pi is: " + pi);  
        
        // Example 3: Converting String to boolean
        String boolStr = "true";
        boolean flag = Boolean.parseBoolean(boolStr);
        System.out.println("The boolean value is: " + flag);
        
        // Example 4: Converting int to String using String.valueOf()
        int numValue = 42;
        String numAsStr = String.valueOf(numValue);
        System.out.println("The integer as a string is: " + numAsStr);
             
        // Example 5: Converting char to String using Character.toString()
        // Convert the char 'C' to a String using Character.toString().
        char anotherChar = 'C';
        String charToString = Character.toString(anotherChar);
        System.out.println("The char as a string is: " + charToString);
    }
}
