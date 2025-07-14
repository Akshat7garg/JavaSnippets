/*
 * This program calculates the Greatest Common Divisor (GCD) of two integers.
 * It uses the subtraction-based Euclidean algorithm inside the findGCD() method.
 */

import java.util.Scanner;

public class GCD {

    // Method to compute GCD using subtraction method
    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;

        // ALTERNATIVE (Euclidean method using modulus)
        // while (b != 0) {
        //     int temp = b;
        //     b = a % b;
        //     a = temp;
        // }
        // return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Take input from user
        System.out.print("Enter first number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number, b: ");
        int b = sc.nextInt();
        sc.close(); // Close Scanner

        // Print the GCD
        System.out.print("Greatest common divisor of '" + a + "' & '" + b + "': " + findGCD(a, b));
    }
}
