/*
 * This program takes a list of integers from the user
 * and finds the largest and smallest number among them.
 */

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Input the number of elements
        System.out.print("How many numbers you want to enter: ");
        int size = sc.nextInt();

        // Input all numbers
        System.out.print("Enter all '" + size + "' numbers: ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close(); // Close Scanner

        // Initialize min and max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find min and max using a loop
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // Output results
        System.out.println("Largest number among all the numbers: " + max);
        System.out.println("Smallest number among all the numbers: " + min);
    }
}
