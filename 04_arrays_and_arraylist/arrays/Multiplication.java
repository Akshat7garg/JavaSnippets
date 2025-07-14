/*
 * This program multiplies two matrices A and B.
 * Matrix A has dimensions (rows x rowCol) and matrix B has dimensions (rowCol x columns).
 * The resulting matrix will have dimensions (rows x columns).
 */

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Input dimensions of matrix A and B
        System.out.print("Number of rows in matrix A: ");
        int rows = sc.nextInt();
        System.out.println("Note: Number of columns in A = Number of rows in B.");
        System.out.print("Enter common dimension (columns of A / rows of B): ");
        int rowCol = sc.nextInt();
        System.out.print("Number of columns in matrix B: ");
        int columns = sc.nextInt();

        // Input matrix A
        System.out.println("Enter elements of matrix A:");
        int[][] a = new int[rows][rowCol];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rowCol; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of matrix B:");
        int[][] b = new int[rowCol][columns];
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close scanner

        // Initialize result matrix
        int[][] multiplication = new int[rows][columns];

        // Perform matrix multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < rowCol; k++) {
                    multiplication[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Multiplication of matrix A and B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
}
