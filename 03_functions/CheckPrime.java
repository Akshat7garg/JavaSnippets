/*
 * This program checks whether a given number is prime.
 * It uses a separate method isPrime(int num) that efficiently checks for primality:
 * - It skips even numbers after checking for 2.
 * - It only checks up to the square root of the number.
 */

import java.util.Scanner;

public class CheckPrime {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num == 2)
            return true; // 2 is prime
        if (num % 2 == 0)
            return false; // Eliminate even numbers

        // Check odd divisors up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true; // If no divisors found, number is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input
        sc.close(); // Close Scanner

        // Handle special cases and check primality
        if (num <= 0) {
            System.out.print("Invalid input");
        } else if (num == 1) {
            System.out.print("Given number is co-prime");
        } else if (isPrime(num)) {
            System.out.print("Given number is prime");
        } else {
            System.out.print("Given number is not prime");
        }
    }
}
