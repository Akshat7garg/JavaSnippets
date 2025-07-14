import java.util.Scanner;

// Program to reverse a string entered by the user
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner for input

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string (no spaces allowed)

        sc.close(); // Close scanner to free resources

        int len = str.length(); // Get string length
        String newStr = ""; // To store reversed string

        // Loop from end to start and build reversed string
        for (int i = len - 1; i >= 0; i--) {
            newStr += str.charAt(i); // Append each character in reverse order
        }

        System.out.println("Reversed string: " + newStr); // Output result
    }
}
