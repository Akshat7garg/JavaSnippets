/*
 * This program takes a list of names from the user
 * and displays all entered names using an ArrayList.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the number of names to enter
        System.out.print("How many names do you want to enter? ");
        int size = sc.nextInt();

        ArrayList<String> names = new ArrayList<>();

        // Input names
        System.out.print("Enter all '" + size + "' names: ");
        for (int i = 0; i < size; i++) {
            names.add(sc.next());
        }

        sc.close(); // Close the scanner

        // Output the entered names
        System.out.print("The names you entered are:");
        for (String name : names) {
            System.out.print(" " + name);
        }
    }
}
