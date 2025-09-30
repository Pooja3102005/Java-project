package Codechef;

public class Codechef92 {
public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
           String trimmedFeedback = feedback.trim();

        // convert trimmedFeedback to upper case and lower case
           String upperCaseFeedback = trimmedFeedback.toUpperCase();
           String lowerCaseFeedback = trimmedFeedback.toLowerCase();

        
        // output the strings and length as required
             System.out.println(upperCaseFeedback);
             System.out.println(lowerCaseFeedback);
             System.out.println(trimmedFeedback.length());



    }
}
