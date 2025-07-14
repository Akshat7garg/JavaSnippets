import java.util.Scanner;

// Program to print numbers from n down to 1 recursively in backward order
public class PrintBackward {

    // Recursive method to print numbers from num down to 1
    public static void printBackward(int num) {
        if (num == 0)
            return; // Base case: stop when zero

        System.out.print(" " + num); // Print current number before recursive call
        printBackward(num - 1); // Recursive call with num-1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read number
        sc.close(); // Close scanner

        System.out.print("Printing numbers from '" + num + "' to '1' (in backward direction):");
        printBackward(num); // Start printing recursively
    }
}
