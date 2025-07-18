import java.util.Scanner;

public class NumberInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print right-aligned inverted half pyramid with row numbers
        for (int i = 1; i <= rows; i++) {
            // Leading spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Print row number decreasing in width
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println(); // Move to next row
        }
    }
}
