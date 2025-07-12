/*
 * This program prints all even numbers from 0 up to a number entered by the user.
 * It uses a loop to check and display even numbers within the given range.
 */

import java.util.Scanner;

public class EvenList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input number
        sc.close(); // Close Scanner

        System.out.print("Even numbers from 0 to " + num + ": ");
        
        // Loop from 0 to the entered number
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) { // Check if number is even
                System.out.print(i + " ");
            }
        }

        // ALTERNATIVE (faster way by skipping odd numbers):
        
        // for (int i = 0; i <= num; i += 2) {
        //     System.out.print(i + " ");
        // }
    }
}
