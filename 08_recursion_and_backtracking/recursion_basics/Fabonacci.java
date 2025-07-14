import java.util.Scanner;

// Program to print Fibonacci series of given size using recursion
public class Fabonacci {

    // Recursive method to print Fibonacci numbers after first two
    public static void fab(int size, int first, int second) {
        if (size == 0)
            return; // Base case: no more numbers to print

        System.out.print(" " + (first + second)); // Print next Fibonacci number
        fab(size - 1, second, first + second); // Recurse with updated pair
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number (number >= 0): ");
        int size = sc.nextInt(); // Read desired Fibonacci size
        sc.close(); // Close scanner

        // Handle edge cases for size 0 and 1
        if (size <= 0) {
            System.out.print("Fibonacci series of size '" + size + "': 0");
        } else if (size == 1) {
            System.out.print("Fibonacci series of size '" + size + "': 1");
        } else {
            System.out.print("Fibonacci series of size '" + size + "': ");
            System.out.print("0 1"); // Print first two Fibonacci numbers
            fab(size - 2, 0, 1); // Print remaining numbers recursively
        }
    }
}
