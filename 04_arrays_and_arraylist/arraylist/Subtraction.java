/*
 * This program subtracts two matrices A and B using ArrayLists.
 * It reads both matrices from the user and computes A - B.
 * The result is stored in a third matrix and printed row-wise.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Input dimensions
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        // Input matrix A
        System.out.println("Enter all the elements in matrix A:");
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            list1.add(row);
        }

        // Input matrix B
        System.out.println("Enter all the elements in matrix B:");
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(sc.nextInt());
            }
            list2.add(row);
        }

        sc.close(); // Close input

        // Perform element-wise subtraction: A - B
        ArrayList<ArrayList<Integer>> subtraction = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(list1.get(i).get(j) - list2.get(i).get(j));
            }
            subtraction.add(row);
        }

        // Print the resulting matrix
        System.out.println("Subtraction matrix of both A and B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(subtraction.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
