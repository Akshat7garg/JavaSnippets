/*
 * This program prints the multiplication table of a given number from 1 to 10.
 * It uses a separate method printTable(int num) to display the table.
 */

import java.util.Scanner;

public class DisplayTable {

    // Method to print table of the given number
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input number
        sc.close(); // Close Scanner

        printTable(num); // Call method to print table
    }
}
