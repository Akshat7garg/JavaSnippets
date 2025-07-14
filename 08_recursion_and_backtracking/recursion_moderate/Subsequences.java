import java.util.Scanner;

// Program to print all subsequences of a given string using recursion
public class Subsequences {

    // Recursive method to find all subsequences
    public static void findSubsequences(String str, String newstr, int idx) {
        if (idx == str.length()) {
            // Base case: reached end of input string
            System.out.println(newstr); // Print the current subsequence
            return;
        }

        // Exclude current character and move forward
        findSubsequences(str, newstr, idx + 1);

        // Include current character and move forward
        findSubsequences(str, newstr + str.charAt(idx), idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string
        sc.close(); // Close scanner

        System.out.println("All subsequences of the given string are as follow: ");
        findSubsequences(str, "", 0); // Start recursion from index 0 with empty subsequence
    }
}
