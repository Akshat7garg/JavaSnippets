/*
 * This program calculates the sum of all odd numbers from 0 to a given number (inclusive).
 * It works for both positive and negative input values.
 */

import java.util.Scanner;

public class OddSum {

    // Method to calculate the sum of odd numbers from 0 to num
    public static int calculateSum(int num) {
        int sum = 0;

        int start = Math.min(num, 0); // Handles negative input
        int limit = Math.max(num, 0); // Handles positive input

        for (int i = start; i <= limit; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read number
        sc.close(); // Close Scanner

        // Display the result
        System.out.print("Sum of odd numbers from 0 to " + num + ": " + calculateSum(num));
    }
}
