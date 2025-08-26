package Codechef;

public class Codechef52 {
	public static void main(String[] args) {
        boolean isAbove18 = true;
        boolean hasDrivingLicense = true;

        // Check if the person is eligible to drive (must be above 18 AND must have a driving license)
        boolean canDrive = isAbove18 && hasDrivingLicense;

        // Display the result
        System.out.println("Is the person eligible to drive? " + canDrive); // Output: true
    }
}



