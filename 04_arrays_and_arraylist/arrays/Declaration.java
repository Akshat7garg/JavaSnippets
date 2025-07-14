/*
 * This program takes a list of names from the user
 * and displays them together in a single line.
 */

import java.util.Scanner;

public class Declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Input number of names
        System.out.print("How many names you want to enter: ");
        int size = sc.nextInt();

        // Input names
        String[] names = new String[size];
        System.out.print("Enter all '" + size + "' names: ");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        sc.close(); // Close Scanner

        // Print entered names
        System.out.print("The names you entered are:");
        for (String name : names) {
            System.out.print(" " + name);
        }
    }
}
