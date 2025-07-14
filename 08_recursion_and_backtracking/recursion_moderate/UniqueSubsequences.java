import java.util.HashSet;
import java.util.Scanner;

// Program to print all unique subsequences of a given string
public class UniqueSubsequences {

    public static HashSet<String> set = new HashSet<>(); // To avoid duplicate subsequences

    // Recursive method to generate all subsequences
    public static void findSubsequences(String str, String newstr, int idx) {
        if (idx == str.length()) { // Base case: end of string
            if (!set.contains(newstr)) {
                System.out.println(newstr); // Print only if not already printed
                set.add(newstr); // Mark as printed
            }
            return;
        }

        // Exclude current character
        findSubsequences(str, newstr, idx + 1);

        // Include current character
        findSubsequences(str, newstr + str.charAt(idx), idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string
        sc.close(); // Close scanner

        System.out.println("All subsequences of the given string are as follow: ");
        findSubsequences(str, "", 0); // Start recursion
    }
}
