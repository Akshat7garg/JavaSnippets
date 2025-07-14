import java.util.Scanner;

// Program to move all 'x' characters in the string to the end using recursion
public class MoveX {

    public static StringBuilder sb = new StringBuilder(); // To build final result

    // Appends 'x' characters at the end after processing
    public static void addingx(int count) {
        for (int i = 0; i < count; i++) {
            sb.append('x');
        }
    }

    // Recursive function to move all 'x' to the end
    public static void movex(String str, int idx, int count) {
        if (idx == str.length()) {
            addingx(count); // Add all counted 'x' at the end
            return;
        }

        if (str.charAt(idx) == 'x') {
            movex(str, idx + 1, count + 1); // Count and skip 'x'
        } else {
            sb.append(str.charAt(idx)); // Keep non-'x' characters
            movex(str, idx + 1, count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string
        sc.close(); // Close scanner

        movex(str, 0, 0); // Start recursion
        System.out.println("String after moving all 'x' to last: " + sb); // Print result
    }
}
