/*
 * This program subtracts two matrices A and B of the same dimensions.
 * It takes matrix input from the user and outputs matrix A - B.
 */

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Input matrix dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input elements for matrix A
        System.out.println("Enter all the elements in matrix A:");
        int[][] a = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input elements for matrix B
        System.out.println("Enter all the elements in matrix B:");
        int[][] b = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close Scanner

        // Perform matrix subtraction (A - B)
        int[][] subtraction = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                subtraction[i][j] = a[i][j] - b[i][j];
            }
        }

        // Print the result
        System.out.println("Subtraction matrix (A - B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }
    }
}
