/*
 * This program checks whether a list of integers entered by the user
 * is sorted in ascending order, descending order, or not sorted at all.
 * It uses an ArrayList to store the numbers and compares adjacent elements.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class CheckSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers user wants to enter
        System.out.print("How many numbers do you want to enter: ");
        int size = sc.nextInt();

        // Handle edge case where no numbers are entered
        if (size <= 0) {
            System.out.println("No numbers entered.");
            sc.close();
            return;
        }

        // Read all numbers into an ArrayList
        System.out.print("Enter all '" + size + "' numbers: ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }

        sc.close(); // Close the scanner

        // Flags to track sorting order
        boolean ascending = true;
        boolean descending = true;

        // Loop through list to compare adjacent elements
        for (int i = 1; i < size; i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                ascending = false; // Not ascending if current < previous
            }
            if (nums.get(i) > nums.get(i - 1)) {
                descending = false; // Not descending if current > previous
            }
        }

        // Determine result based on flags
        if (ascending && descending) {
            System.out.println("All numbers in the group are equal.");
        } else if (ascending) {
            System.out.println("Given group of numbers is sorted in ascending order.");
        } else if (descending) {
            System.out.println("Given group of numbers is sorted in descending order.");
        } else {
            System.out.println("Given group of numbers is not sorted.");
        }
    }
}
