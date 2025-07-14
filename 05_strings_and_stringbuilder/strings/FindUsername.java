import java.util.Scanner;

// Program to extract the username part from an email (before '@')
public class FindUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter your email: ");
        String email = sc.next(); // Read email input

        sc.close(); // Close scanner
        int len = email.length();

        // METHOD 1: Print characters one by one until '@' is found
        System.out.print("Your new username: ");
        for (int i = 0; i < len; i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            System.out.print(email.charAt(i));
        }
        System.out.println();

        // METHOD 2: Find index of '@' manually, then use substring
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            idx++;
        }
        System.out.println("Your new username: " + email.substring(0, idx));

        // METHOD 3: Use built-in indexOf to find '@'
        int idx2 = email.indexOf('@');
        System.out.println("Your new username: " + email.substring(0, idx2));
    }
}
