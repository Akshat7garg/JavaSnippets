import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows (half height of the butterfly)
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Left hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }

            // Right hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println(); // Move to next row
        }

        // Lower half
        for (int i = rows; i >= 1; i--) {
            // Left hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }

            // Right hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println(); // Move to next row
        }
    }
}
