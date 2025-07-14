import java.util.Scanner;

// Program to replace all 'e' characters with 'i' using StringBuilder
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.next()); // Read input into a mutable StringBuilder

        sc.close(); // Close scanner
        int len = sb.length();

        // Loop through each character and replace 'e' with 'i'
        for (int i = 0; i < len; i++) {
            if (sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'i'); // Replace character at index i
            }
        }

        // Print the modified string
        System.out.println("New string with replaced character: " + sb);
    }
}
