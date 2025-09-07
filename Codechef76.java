package Codechef;

public class Codechef76 {
	public static void main(String[] args) {
        // Step 1: Define the file name
        String fileName = "Document.PDF";

        // Step 2: Extract the file extension starting from index 9
           String fileExtension = fileName.substring(9);

        // Step 3: Compare the extracted file extension with "pdf" in a case-insensitive manner
        System.out.println(fileExtension.equalsIgnoreCase("pdf"));
    }
}
