import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows (half of the butterfly height)
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to next row
        }

        // Lower half
        for (int i = rows; i >= 1; i--) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to next row
        }
    }
}
