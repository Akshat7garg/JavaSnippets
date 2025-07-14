import java.util.Scanner;

// Program to reverse a string using recursion
public class ReverseString {

    // Recursive function to reverse a string
    public static String reverseStr(String str) {
        if (str.length() == 1) {
            return str; // Base case: return single character
        }

        char currChar = str.charAt(0); // First character
        String nextChar = reverseStr(str.substring(1)); // Reverse the rest

        return nextChar + currChar; // Append current character at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input
        sc.close(); // Close scanner

        System.out.print("Reverse of the given string: " + reverseStr(str)); // Output result
    }
}
