/*
 * This program calculates the value of a number raised to a power.
 * It uses a loop-based method calculatePow(int base, int pow) to compute base^pow.
 */

import java.util.Scanner;

public class Power {

    // Method to calculate power using loop
    public static long calculatePow(int base, int pow) {
        long result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= base;
        }

        return result;

        // ALTERNATIVE (built-in method)
        // return (long) Math.pow(base, pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power (greater than or equal to 0): ");
        int pow = sc.nextInt();
        sc.close(); // Close scanner

        if (pow < 0) {
            System.out.print("Invalid input: power should be >= 0");
        } else {
            System.out.print(base + " to the power of " + pow + ": " + calculatePow(base, pow));
        }
    }
}
