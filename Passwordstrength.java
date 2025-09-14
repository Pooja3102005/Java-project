package Codechef;

public class Passwordstrength {
	public static void main(String[] args) {
        String password = "mypass123";
        
        // Use a ternary operator to check the password strength
        // Your code here
        String strength = password.length() <8 ? "Weak" : "Strong";
        System.out.println("Password strength: " + strength);
    }
}
