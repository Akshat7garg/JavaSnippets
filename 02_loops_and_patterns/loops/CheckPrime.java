/*
 * This program checks whether a given number is prime.
 * - It returns invalid for 0 or negative numbers.
 * - It identifies 1 as a co-prime.
 * - For numbers >= 2, it checks if they are divisible by any number from 2 to (n-1).
 */

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input number
        sc.close(); // Close Scanner

        // Handle special cases
        if (num <= 0) {
            System.out.print("Given number is invalid number.");
            return;
        } else if (num == 1) {
            System.out.print("Given number is a co-prime number.");
            return;
        }

        boolean flag = true;

        // Check if num is divisible by any number from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false; // Not a prime number
                break;
            }
        }

        // ALTERNATIVE (faster way by skipping even numbers):
        
        // if (num == 2) {
        //     System.out.print("Given number is a prime number.");
        //     return;
        // } else if (num % 2 == 0) {
        //     System.out.print("Given number is not a prime number.");
        //     return;
        // }

        // Check for divisibility from 3 to sqrt(num), skipping even numbers
        // for (int i = 3; i * i <= num; i += 2) {
        //     if (num % i == 0) {
        //         flag = false; // Not a prime number
        //         break;
        //     }
        // }

        // Output result
        if (flag) {
            System.out.print("Given number is a prime number.");
        } else {
            System.out.print("Given number is not a prime number.");
        }
    }
}