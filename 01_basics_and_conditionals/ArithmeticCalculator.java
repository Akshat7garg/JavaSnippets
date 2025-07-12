/*
 * This program acts as a basic arithmetic calculator.
 * It takes two numbers (a and b) from the user and performs the selected operation:
 * addition, subtraction, multiplication, division, or remainder calculation.
 * It uses a switch-case to handle different operator inputs.
 */

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Take input for two numbers
        System.out.print("Enter first number, a: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number, b: ");
        double b = sc.nextDouble();

        // Display available operations
        System.out.println("For Arithmetic calculation, enter any following key:");
        System.out.println("'+' for addition (a + b)");
        System.out.println("'-' for subtraction (a - b)");
        System.out.println("'*' for multiplication (a * b)");
        System.out.println("'/' for division (a / b)");
        System.out.println("'%' for remainder calculation (a % b)");

        // Ask user to select an operation
        System.out.print("Enter your choice: ");
        String choice = sc.next(); // Read operator
        sc.close(); // Close Scanner

        // Perform operation based on user choice
        switch (choice) {
            case "+":
                System.out.print("Addition of " + a + " and " + b + " = " + (a + b));
                break;
            case "-":
                System.out.print("Subtraction of " + a + " and " + b + " = " + (a - b));
                break;
            case "*":
                System.out.print("Multiplication of " + a + " and " + b + " = " + (a * b));
                break;
            case "/":
                // Handle division by zero
                if (b == 0) {
                    System.out.print("Division is not possible as b = 0");
                } else {
                    System.out.print("Division of " + a + " and " + b + " = " + (a / b));
                }
                break;
            case "%":
                // Handle remainder by zero
                if (b == 0) {
                    System.out.print("Remainder calculation is not possible as b = 0");
                } else {
                    System.out.print("Remainder of " + a + " and " + b + " = " + (a % b));
                }
                break;
            default:
                System.out.print("Invalid choice."); // If operator is not recognized
        }
    }
}
