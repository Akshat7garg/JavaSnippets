/*
 * This program takes a 2D matrix as input and prints its elements in spiral order.
 * It handles all edge cases, including single rows or columns.
 */

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner for input

        // Input matrix dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix elements
        System.out.println("Enter all the elements in matrix: ");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close scanner

        // Set boundary indices
        int r1 = 0, r2 = rows - 1;
        int c1 = 0, c2 = columns - 1;

        System.out.println("Printing the matrix in spiral format:");
        while (r1 <= r2 && c1 <= c2) {

            // Special case: single row
            if (r1 == r2) {
                for (int i = c1; i <= c2; i++) {
                    System.out.print(matrix[r1][i] + " ");
                }
                break;
            }

            // Special case: single column
            if (c1 == c2) {
                for (int i = r1; i <= r2; i++) {
                    System.out.print(matrix[i][c1] + " ");
                }
                break;
            }

            // Top row (left to right)
            for (int i = c1; i <= c2; i++) {
                System.out.print(matrix[r1][i] + " ");
            }
            r1++;

            // Right column (top to bottom)
            for (int i = r1; i <= r2; i++) {
                System.out.print(matrix[i][c2] + " ");
            }
            c2--;

            // Bottom row (right to left)
            for (int i = c2; i >= c1; i--) {
                System.out.print(matrix[r2][i] + " ");
            }
            r2--;

            // Left column (bottom to top)
            for (int i = r2; i >= r1; i--) {
                System.out.print(matrix[i][c1] + " ");
            }
            c1++;
        }
    }
}
