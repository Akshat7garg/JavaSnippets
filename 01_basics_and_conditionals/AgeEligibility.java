/*
 * This program checks if a person is eligible to vote based on their age.
 * It asks the user to enter their age and displays a message accordingly.
 */

import java.util.Scanner; // Import Scanner for input

public class AgeEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Enter your age: "); // Ask user to enter age
        int age = sc.nextInt(); // Store entered age
        sc.close(); // Close Scanner

        // Check if age is invalid
        if (age <= 0) {
            System.out.print("Invalid input.");
        }
        // Check if age is under 18
        else if (age >= 1 && age < 18) {
            System.out.print("Not eligible for voting as you are underage.");
        }
        // Age is 18 or more
        else {
            System.out.print("You are eligible to vote.");
        }
    }
}
