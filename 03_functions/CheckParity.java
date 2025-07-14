/*
 * This program checks whether a number is even or odd using a separate method.
 * It uses the parity() method which returns true for even, false for odd.
 */

import java.util.Scanner;

public class CheckParity {

    // Method to check parity (even or odd)
    public static boolean parity(int num) {
        return (num % 2 == 0); // Returns true if even
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input
        sc.close(); // Close Scanner

        // Call method and display result
        if (parity(num)) {
            System.out.print("Given number is Even.");
        } else {
            System.out.print("Given number is Odd."); // Corrected output
        }
    }
}
