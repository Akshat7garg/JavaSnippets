import java.util.Scanner;

// Program to print numbers from 1 to n recursively in forward order
public class PrintForward {

    // Recursive method to print numbers from 1 up to num
    public static void printForward(int num) {
        if (num == 0)
            return; // Base case: stop when zero

        printForward(num - 1); // Recursive call with num-1

        System.out.print(" " + num); // Print current number after recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read number
        sc.close(); // Close scanner

        System.out.print("Printing numbers from '1' to '" + num + "' (in forward direction):");
        printForward(num); // Start printing recursively
    }
}
