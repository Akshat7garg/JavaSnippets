import java.util.Scanner;

// Program to calculate base^power using two recursive methods
public class Power {

    // Simple recursive method: multiply base power times
    public static long calculatePow1(int base, int power) {
        if (base == 0) {
            return 0; // 0^power is 0
        } else if (power == 0 || base == 1) {
            return 1; // base^0 = 1, and 1^power = 1
        }

        // Recursive multiplication: base * base^(power-1)
        return base * calculatePow1(base, power - 1);
    }

    // Optimized recursive method using divide and conquer (fast exponentiation)
    public static long calculatePow2(int base, int power) {
        if (base == 0) {
            return 0; // 0^power is 0
        } else if (power == 0 || base == 1) {
            return 1; // base^0 = 1, and 1^power = 1
        }

        // If power is even, use (base^(power/2))^2
        if (power % 2 == 0) {
            long half = calculatePow2(base, power / 2);
            return half * half;
        } else {
            // If power is odd, multiply by base once more
            long half = calculatePow2(base, power / 2);
            return half * half * base;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        sc.close(); // Close scanner

        System.out.println(base + " to the power of " + power + " (Method - 1): " + calculatePow1(base, power));
        System.out.println(base + " to the power of " + power + " (Method - 2): " + calculatePow2(base, power));
    }
}
