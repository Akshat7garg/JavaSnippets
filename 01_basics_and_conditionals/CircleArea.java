/*
 * This program calculates the area and circumference of a circle.
 * It takes the radius as input from the user and uses the formula:
 * - Area = π * r²
 * - Circumference = 2 * π * r
 */

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        final double PI = 3.14; // Constant value of PI

        System.out.print("Enter the value of radius of the circle: ");
        double radius = sc.nextDouble(); // Read radius input
        sc.close(); // Close Scanner

        // Calculate and display area and circumference
        System.out.println("Area of the circle: " + (PI * radius * radius));
        System.out.println("Circumference of the circle: " + (2 * PI * radius));
    }
}
