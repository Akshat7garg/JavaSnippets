/*
 * This program adds two matrices A and B of the same size.
 * It takes input for both matrices, performs element-wise addition,
 * and prints the resulting matrix.
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Input dimensions of matrices
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix A
        System.out.println("Enter all the elements in matrix A:");
        int[][] a = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter all the elements in matrix B:");
        int[][] b = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close Scanner

        // Add matrices element-wise
        int[][] addition = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                addition[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print resulting matrix
        System.out.println("Addition matrix of both A and B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }
    }
}
