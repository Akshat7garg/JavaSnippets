/*
 * This program prints the first 'n' terms of the Fibonacci series.
 * The series starts with 0 and 1, and each next number is the sum of the previous two.
 */

import java.util.Scanner;

public class Fabonacci {

    // Method to print Fibonacci series up to the given limit
    public static void fab(int limit) {
        if (limit == 1) {
            System.out.print("0");
            return;
        }

        System.out.print("0 1 "); // First two numbers

        int a = 0;
        int b = 1;

        while (limit > 2) {
            int c = a + b;
            a = b;
            b = c;
            limit--;
            System.out.print(c + " "); // Add space between numbers
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        System.out.print("Enter the size of Fibonacci series: ");
        int num = sc.nextInt(); // Read number of terms
        sc.close(); // Close Scanner

        // Handle invalid input
        if (num <= 0) {
            System.out.print("Invalid input");
        } else {
            System.out.print("First '" + num + "' elements of the Fibonacci series: ");
            fab(num); // Call method to print series
        }
    }
}
