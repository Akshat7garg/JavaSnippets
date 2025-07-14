/*
 * This program reads a list of integers from the user,
 * and finds the minimum and maximum value among them.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the list
        System.out.print("How many numbers do you want to enter? ");
        int size = sc.nextInt();

        // Input numbers into the ArrayList
        System.out.print("Enter all '" + size + "' numbers: ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }

        sc.close(); // Close scanner

        // Initialize min and max with extreme values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Loop to find min and max
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // Output the results
        System.out.println("Largest number among all the numbers: " + max);
        System.out.println("Smallest number among all the numbers: " + min);
    }
}
