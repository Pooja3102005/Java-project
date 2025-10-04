package Codechef;

public class Joiningwords {
	 public static void main(String[] args) {
	        
	        // Example 1: Joining multiple words into a sentence
	        // The join() method concatenates the words with spaces between them.
	        String word1 = "Good";
	        String word2 = "Morning";
	        String word3 = "Everyone";
	        String sentence = String.join(" ", word1, word2, word3); // Use ' ' delimeter to join the words
	        System.out.println("Joined Sentence: " + sentence);
	        

	        // Example 2: Creating a file path using directory names
	        String dir1 = "home";
	        String dir2 = "user";
	        String dir3 = "documents";
	        String dir4 = "projects";
	        String filePath = String.join("/", dir1, dir2, dir3, dir4); // Use '/' delimeter to join the file path
	        System.out.println("File Path: " + filePath);

	        // Example 3: Joining numbers into a formatted string
	        String score1 = "85";
	        String score2 = "90";
	        String score3 = "78";
	        String score4 = "92";
	        String scoreBoard = String.join(" | ", score1, score2, score3, score4); // Use '|' delimeter to join the numbers
	        System.out.println("Score Board: " + scoreBoard);
	    }
}
