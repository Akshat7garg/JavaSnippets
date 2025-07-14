/*
 * This program checks whether a list of numbers entered by the user
 * is sorted in ascending, descending, all-equal, or unsorted order.
 */

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Input size and elements
        System.out.print("How many numbers you want to enter: ");
        int size = sc.nextInt();

        System.out.print("Enter all '" + size + "' numbers: ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close(); // Close scanner

        // Counters for order detection
        int ascending = 1;
        int descending = 1;

        for (int i = 1; i < size; i++) {
            if (nums[i] > nums[i - 1]) {
                descending = 0;
            } else if (nums[i] < nums[i - 1]) {
                ascending = 0;
            }
        }

        // Final check and output
        if (ascending == 1 && descending == 1) {
            System.out.println("All numbers in the group are equal.");
        } else if (ascending == 1) {
            System.out.println("Given group of numbers is already sorted in ascending order.");
        } else if (descending == 1) {
            System.out.println("Given group of numbers is already sorted in descending order.");
        } else {
            System.out.println("Given group of numbers is not sorted.");
        }
    }
}
