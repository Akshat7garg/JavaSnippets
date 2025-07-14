/*
 * This program calculates the factorial of a non-negative integer.
 * It uses a method fact(int num) to compute the factorial using a loop.
 */

import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial
    public static long fact(int num) {
        if (num <= 1)
            return 1;

        long total = 1;
        for (int i = 2; i <= num; i++) {
            total *= i; // Multiply by each number from 2 to num
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number whose factorial you want to calculate: ");
        int num = sc.nextInt(); // Read input
        sc.close(); // Close Scanner

        if (num < 0) {
            System.out.print("Invalid input");
            return;
        }

        // Display the factorial
        System.out.print("Factorial of '" + num + "': " + fact(num));
    }
}
