import java.util.Scanner;

// Program to reverse a string using StringBuilder
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.next()); // Read input as StringBuilder

        sc.close(); // Close scanner

        int left = 0;
        int right = sb.length() - 1;

        // Swap characters from both ends moving toward the center
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        System.out.println("New string with replaced character: " + sb);

        // ALTERNATIVE METHOD: built-in reverse()
        // System.out.println("New string with replaced character: " + sb.reverse());
    }
}
