/*
 * This program allows the user to enter marks repeatedly and gives feedback based on the marks.
 * The user can choose to continue or stop entering marks by providing 1 or 0.
 */

import java.util.Scanner;

public class DisplayMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.println("Enter your marks and we give you a comment on that;");
        System.out.print("'1' to enter marks and '0' to stop entering, choice: ");
        int choice = sc.nextInt(); // Get initial choice from user

        while (choice == 1) { // Repeat while user chooses 1
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt(); // Read marks

            // Check range and give appropriate comment
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input.");
            } else if (marks >= 90) {
                System.out.println("This is good.");
            } else if (marks >= 60) {
                System.out.println("This is good also.");
            } else if (marks >= 40) {
                System.out.println("This is good as well.");
            } else if (marks >= 20) {
                System.out.println("Need improvement.");
            } else {
                System.out.println("Need to work and study hard.");
            }

            // Ask user if they want to continue
            System.out.print("'1' for add more marks, else '0': ");
            choice = sc.nextInt();
        }

        sc.close(); // Close Scanner
    }
}
