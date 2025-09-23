package Codechef;

public class BreakStmt {
	public static void main(String[] args) {
        int num = 1;

        while (num <= 10) { // Loop runs from 1 to 10
            if (num == 5) {
                break; // Exit the loop when num reaches 5
            }
            System.out.println("Number: " + num);
            num++;
        }
    }
}
