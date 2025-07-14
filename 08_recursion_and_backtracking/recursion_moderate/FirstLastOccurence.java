import java.util.Scanner;

// Program to find the first and last occurrence of a character in a string using recursion
public class FirstLastOccurence {

    public static int first = -1; // Stores index of first occurrence
    public static int last = -1; // Stores index of last occurrence

    // Recursive method to find occurrences of character ch in str starting at idx
    public static void findOccurence(String str, char ch, int idx) {
        if (idx == str.length()) {
            return; // Base case: reached end of string
        }

        if (str.charAt(idx) == ch) {
            if (first == -1) {
                first = idx; // Set first occurrence if not set
            }
            last = idx; // Update last occurrence every time ch is found
        }

        findOccurence(str, ch, idx + 1); // Recurse for next character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read string
        System.out.print("Enter a character whose occurrence you want to search: ");
        String searchChar = sc.next(); // Read character (as string)
        sc.close(); // Close scanner

        findOccurence(str, searchChar.charAt(0), 0); // Start recursion

        System.out.println("First occurrence of '" + searchChar.charAt(0) + "' in the given string: " + first);
        System.out.println("Last occurrence of '" + searchChar.charAt(0) + "' in the given string: " + last);
    }
}
