package Codechef;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        
        // Validate that start is less than end
        while (start >= end) {
            System.out.println("Invalid input! Start value must be less than end value.");
        }

        // Loop starting from start, incrementing by step each time
         for (int i = start; i <= end; i += step) {
             
           if (i % 7 == 0 &&  i % 14 == 0) {
               System.out.println(i);
               break;
           }
       }

    }


}
