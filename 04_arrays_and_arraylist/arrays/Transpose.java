/*
 * This program takes a matrix from the user and prints its transpose.
 * Transpose of a matrix is formed by swapping rows with columns.
 */

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Input matrix dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Create and fill the matrix
        int matrix[][] = new int[rows][columns];
        System.out.println("Enter all the elements in matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close Scanner

        // Print the transpose of the matrix
        System.out.println("Transpose of the given matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
