import java.util.Scanner;

// Program to extract username (part before '@') from an email using StringBuilder
public class FindUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter your email: ");
        StringBuilder sb = new StringBuilder(sc.next()); // Read email as mutable StringBuilder

        sc.close(); // Close scanner

        int len = sb.length();
        int idx = 0;

        // Find the position of '@' symbol
        while (idx < len && sb.charAt(idx) != '@')
            idx++;

        // Delete everything after (and including) '@'
        sb.delete(idx, len);

        // Print extracted username
        System.out.print("Your new username: " + sb);
    }
}
