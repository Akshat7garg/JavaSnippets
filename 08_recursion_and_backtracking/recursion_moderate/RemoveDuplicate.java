import java.util.Scanner;

// Program to remove duplicate characters from a string using recursion
public class RemoveDuplicate {

    public static boolean map[] = new boolean[26]; // Tracks which characters have been added (a-z)
    public static StringBuilder sb = new StringBuilder(); // Stores result string without duplicates

    // Recursive function to build result by skipping duplicates
    public static void removeExisting(String str, int idx) {
        if (idx == str.length()) {
            return; // Base case: reached end of string
        }

        // If character not already added, append and mark it
        if (!map[str.charAt(idx) - 'a']) {
            sb.append(str.charAt(idx));
            map[str.charAt(idx) - 'a'] = true;
        }

        // Recurse to next character
        removeExisting(str, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string (lowercase assumed)
        sc.close(); // Close scanner

        removeExisting(str, 0); // Start recursion
        System.out.println("String after removing all duplicate characters: " + sb);
    }
}
