import java.util.Scanner;

// Program to calculate factorial of a number using recursion
public class Factorial {

    // Recursive method to calculate factorial
    public static long fact(int num) {
        if (num == 0 || num == 1)
            return 1; // Base case: 0! = 1 and 1! = 1

        return num * fact(num - 1); // Recursive step: num * (num-1)!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number (number >= 0): ");
        int num = sc.nextInt(); // Read input number
        sc.close(); // Close scanner

        System.out.print("Factorial of '" + num + "': " + fact(num)); // Output factorial
    }
}
