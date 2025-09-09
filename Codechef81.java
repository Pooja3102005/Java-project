package Codechef;

public class Codechef81 {
	public static void main(String[] args) {
        // Define a string
        String word = "unhappy";

        // Check if the word starts with the prefix "un"
        int prefixIndex = word.indexOf("un");
        boolean startsWithUn = prefixIndex == 0;

        // Print the result
        System.out.println("Does the word start with 'un'? " +startsWithUn);
    }
}
