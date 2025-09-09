package Codechef;

public class Codechef80 {
	public static void main(String[] args) {
        // Define a string
        String sentence = "Learning Java is fun and exciting!";

        // Find the index of the first occurrence of the substring "Java"
        int indexOfJava = sentence.indexOf("Java");

        // Print the index
        System.out.println("The index of 'Java' is: " + indexOfJava);

        // Find the index of the first occurrence of the substring "fun"
        int indexOfFun = sentence.indexOf("fun");

        // Print the index
        System.out.println("The index of 'fun' is: " + indexOfFun);

        // Find the index of a substring that does not exist
        int indexOfPython = sentence.indexOf("Python");

        // Print the index
        System.out.println("The index of 'Python' is: " + indexOfPython);
    }
}
