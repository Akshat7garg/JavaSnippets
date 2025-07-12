/*
 * This program prints the multiplication table of a given number from 1 to 10.
 * It does not use loops; instead, each line is printed individually.
 */

import java.util.Scanner;

public class TableWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter the number whose table you want to print: ");
        int num = sc.nextInt(); // Read the number from user
        sc.close(); // Close Scanner

        // Print multiplication table manually (without loop)
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));
    }
}
