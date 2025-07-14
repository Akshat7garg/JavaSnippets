import java.util.Scanner;

// Program to calculate sum of first n natural numbers using recursion
public class NaturalSum {

    // Recursive method to calculate sum from 1 to num
    public static int sum(int num) {
        if (num == 0)
            return 0; // Base case: sum of 0 numbers is 0

        return num + sum(num - 1); // Recursive sum: current number + sum of previous numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number (number >= 0): ");
        int num = sc.nextInt(); // Read input number
        sc.close(); // Close scanner

        System.out.print("Sum of first '" + num + "' natural numbers: " + sum(num)); // Output result
    }
}
