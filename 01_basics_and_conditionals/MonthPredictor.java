/*
 * This program takes a month number (1 to 12) as input and prints the corresponding month name.
 * If the input is not between 1 and 12, it displays "Invalid month number."
 */

import java.util.Scanner;

public class MonthPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter any month number: ");
        int month = sc.nextInt(); // Read month number
        sc.close(); // Close Scanner

        // Match the month number with its name
        switch (month) {
            case 1:
                System.out.print("1st month is January.");
                break;
            case 2:
                System.out.print("2nd month is February.");
                break;
            case 3:
                System.out.print("3rd month is March.");
                break;
            case 4:
                System.out.print("4th month is April.");
                break;
            case 5:
                System.out.print("5th month is May.");
                break;
            case 6:
                System.out.print("6th month is June.");
                break;
            case 7:
                System.out.print("7th month is July.");
                break;
            case 8:
                System.out.print("8th month is August.");
                break;
            case 9:
                System.out.print("9th month is September.");
                break;
            case 10:
                System.out.print("10th month is October.");
                break;
            case 11:
                System.out.print("11th month is November.");
                break;
            case 12:
                System.out.print("12th month is December.");
                break;
            default:
                System.out.print("Invalid month number."); // For any number not in 1–12
        }
    }
}
