/*
 * This program calculates the area and circumference of a circle.
 * It uses two methods:
 * - area(double radius): returns π * r²
 * - circumference(double radius): returns 2 * π * r
 */

import java.util.Scanner;

public class CircleArea {

    public static double PI = 3.14; // Constant value for PI

    // Method to calculate area of circle
    public static double area(double radius) {
        return (PI * radius * radius);
    }

    // Method to calculate circumference of circle
    public static double circumference(double radius) {
        return (2 * PI * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter the value of radius of the circle: ");
        double radius = sc.nextDouble(); // Read radius
        sc.close(); // Close Scanner

        // Display results
        System.out.println("Area of circle: " + area(radius));
        System.out.print("Circumference of circle: " + circumference(radius));
    }
}
