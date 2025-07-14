/*
 * This program lets the user enter multiple numbers and categorizes them as:
 * positive, negative, or zero. It continues taking input until the user chooses to stop.
 */

import java.util.Scanner;

public class NumberEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        System.out.println("If you want to enter a number press '1', else '0';");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        while (choice == 1) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0)
                positives++;
            else if (num < 0)
                negatives++;
            else
                zeros++;

            System.out.print("If you want to enter another number press '1', else '0', choice: ");
            choice = sc.nextInt();
        }

        sc.close(); // Close Scanner

        // Show counts if any number was entered
        int total = positives + negatives + zeros;
        if (total > 0) {
            System.out.println("You entered the following numbers:");
            System.out.println("Positive numbers: " + positives);
            System.out.println("Negative numbers: " + negatives);
            System.out.print("Zeros: " + zeros);
        } else {
            System.out.print("You didn't enter any number.");
        }
    }
}
