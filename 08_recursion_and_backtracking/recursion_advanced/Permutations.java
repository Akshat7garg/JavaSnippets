import java.util.Scanner;

// Program to print all permutations of a given string using recursion
public class Permutations {

    // Recursive method to generate permutations
    // str: remaining characters to permute
    // newStr: current permutation built so far
    public static void permutation(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr); // Base case: all characters used, print permutation
            return;
        }

        // Iterate over each character in the remaining string
        for (int i = 0; i < str.length(); i++) {
            // Choose character at index i
            String placedStr = newStr + str.charAt(i);
            // Form new string without character at i
            String modifiedStr = str.substring(0, i) + str.substring(i + 1);
            // Recurse with updated strings
            permutation(modifiedStr, placedStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string
        sc.close(); // Close scanner

        System.out.println("All permutations of the given string are as follow: ");
        permutation(str, ""); // Start generating permutations with empty prefix
    }
}
