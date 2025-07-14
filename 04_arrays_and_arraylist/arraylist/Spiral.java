/*
 * This program prints a given matrix in spiral order using ArrayLists.
 * It first takes matrix input from the user and then traverses it
 * in a spiral (clockwise) fashion, printing each element.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Input dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix using ArrayList of ArrayLists
        System.out.println("Enter all the elements in matrix: ");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        sc.close(); // Close input

        // Define boundaries for spiral traversal
        int r1 = 0, r2 = rows - 1;
        int c1 = 0, c2 = columns - 1;

        System.out.println("Printing the matrix in spiral format:");
        while (r1 <= r2 && c1 <= c2) {
            // Special case: only one row left
            if (r1 == r2) {
                for (int i = c1; i <= c2; i++) {
                    System.out.print(matrix.get(r1).get(i) + " ");
                }
                break;
            }

            // Special case: only one column left
            if (c1 == c2) {
                for (int i = r1; i <= r2; i++) {
                    System.out.print(matrix.get(i).get(c1) + " ");
                }
                break;
            }

            // Top row
            for (int i = c1; i <= c2; i++) {
                System.out.print(matrix.get(r1).get(i) + " ");
            }
            r1++;

            // Right column
            for (int i = r1; i <= r2; i++) {
                System.out.print(matrix.get(i).get(c2) + " ");
            }
            c2--;

            // Bottom row
            for (int i = c2; i >= c1; i--) {
                System.out.print(matrix.get(r2).get(i) + " ");
            }
            r2--;

            // Left column
            for (int i = r2; i >= r1; i--) {
                System.out.print(matrix.get(i).get(c1) + " ");
            }
            c1++;
        }
    }
}
