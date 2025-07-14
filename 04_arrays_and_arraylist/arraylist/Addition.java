/*
 * This program performs matrix addition.
 * It takes two matrices A and B as input from the user using ArrayLists
 * and calculates their element-wise sum to produce a new matrix.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Addition {

    // Method to input a matrix from the user
    public static ArrayList<ArrayList<Integer>> inputMatrix(Scanner sc, int rows, int cols, String matrixName) {
        System.out.println("Enter all the elements in matrix " + matrixName + ": ");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            // Loop through each column
            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt()); // Read element
            }
            matrix.add(row); // Add row to matrix
        }
        return matrix; // Return the filled matrix
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input

        // Take matrix size input
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Check for valid size
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid matrix size.");
            sc.close();
            return;
        }

        // Read both matrices
        ArrayList<ArrayList<Integer>> list1 = inputMatrix(sc, rows, columns, "A");
        ArrayList<ArrayList<Integer>> list2 = inputMatrix(sc, rows, columns, "B");

        sc.close(); // Close the scanner

        // Create new matrix to store the result of addition
        ArrayList<ArrayList<Integer>> addition = new ArrayList<>();

        // Loop to calculate element-wise sum
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                int sum = list1.get(i).get(j) + list2.get(i).get(j);
                row.add(sum); // Add sum to the current row
            }
            addition.add(row); // Add row to result matrix
        }

        // Display the result matrix
        System.out.println("Addition matrix of both A and B: ");
        for (ArrayList<Integer> row : addition) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
