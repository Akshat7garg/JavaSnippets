/*
 * This program checks whether a person is eligible to vote.
 * It uses a method isEligible(int age) that returns true if age is 18 or above.
 */

import java.util.Scanner;

public class VotingEligibility {

    // Method to check voting eligibility
    public static boolean isEligible(int age) {
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read age
        sc.close(); // Close Scanner

        // Check for valid input and eligibility
        if (age <= 0) {
            System.out.println("Invalid input");
        } else if (isEligible(age)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible for voting as you are underage");
        }
    }
}
