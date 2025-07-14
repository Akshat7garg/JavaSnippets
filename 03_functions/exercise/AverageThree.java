/*
 * This program calculates the average of three integers.
 * It uses a separate method avg(int a, int b, int c) to compute the average.
 */

import java.util.Scanner;

public class AverageThree {

    // Method to calculate average of three numbers
    public static double avg(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Take input from the user
        System.out.print("Enter first number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number, b: ");
        int b = sc.nextInt();
        System.out.print("Enter third number, c: ");
        int c = sc.nextInt();

        sc.close(); // Close Scanner

        // Display the result
        System.out.print("The average of " + a + ", " + b + " & " + c + ": " + avg(a, b, c));
    }
}
