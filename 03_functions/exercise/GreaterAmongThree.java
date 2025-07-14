/*
 * This program finds the greatest number among three integers.
 * It uses a separate method greater(int a, int b, int c) to return the largest.
 */

import java.util.Scanner;

public class GreaterAmongThree {

    // Method to return the greatest of three numbers
    public static int greater(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

        // ALTERNATIVE (shorter using ternary operator)
        // return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Read three numbers from user
        System.out.print("Enter first number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number, b: ");
        int b = sc.nextInt();
        System.out.print("Enter third number, c: ");
        int c = sc.nextInt();
        sc.close(); // Close scanner

        // Display the greatest number
        System.out.print("The greatest number between " + a + ", " + b + " & " + c + ": " + greater(a, b, c));
    }
}
