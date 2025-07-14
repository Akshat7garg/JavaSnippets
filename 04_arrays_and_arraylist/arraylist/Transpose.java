/*
 * This program takes a 2D matrix input using ArrayLists
 * and prints its transpose (rows become columns and vice versa).
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner

        // Input matrix dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix elements
        System.out.println("Enter all the elements in matrix:");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        sc.close(); // Close scanner

        // Print transpose of matrix
        System.out.println("Transpose of the given matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) { // ✅ Fix: this should be 'j', not 'i'
                System.out.print(matrix.get(j).get(i) + " ");
            }
            System.out.println();
        }
    }
}
