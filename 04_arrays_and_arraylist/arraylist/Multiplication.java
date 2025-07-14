/*
 * This program multiplies two matrices using ArrayLists.
 * It takes input for two matrices A and B, and prints the resulting product matrix C = A × B.
 * The number of columns in A must equal the number of rows in B.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Number of columns in matrix A is equal to number of rows in matrix B;");
        System.out.print("Enter number of rows/columns (shared dimension): ");
        int rowCol = sc.nextInt();

        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix A
        System.out.println("Enter all the elements in matrix A:");
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rowCol; j++) {
                row.add(sc.nextInt());
            }
            list1.add(row);
        }

        // Input matrix B
        System.out.println("Enter all the elements in matrix B:");
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < rowCol; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            list2.add(row);
        }

        sc.close(); // Close Scanner

        // Matrix multiplication logic
        ArrayList<ArrayList<Integer>> multiplication = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                int element = 0;
                for (int k = 0; k < rowCol; k++) {
                    element += list1.get(i).get(k) * list2.get(k).get(j);
                }
                row.add(element); // Add computed value to current row
            }
            multiplication.add(row); // Add row to result matrix
        }

        // Output the result matrix
        System.out.println("Multiplication matrix of both A and B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(multiplication.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
