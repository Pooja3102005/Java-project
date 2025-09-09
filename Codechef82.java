package Codechef;

public class Codechef82 {
	public static void main(String[] args) {
        // Define a string
        String sentence = "Learning Java is fun. Java is powerful.";

        // Find the last occurrence of the letter 'a'
        int lastIndexOfA = sentence.lastIndexOf('a');

        // Print the result
        System.out.println("The last occurrence of 'a' is at index: " + lastIndexOfA);

        // Find the last occurrence of the word "Java"
        int lastIndexOfJava = sentence.lastIndexOf("Java");

        // Print the result
        System.out.println("The last occurrence of 'Java' is at index: " + lastIndexOfJava);
    }
}
