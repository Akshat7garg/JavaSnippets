import java.util.Scanner;

public class RightAlignedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();

        sc.close();

        // Print right-aligned half pyramid
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to next row
        }
    }
}
