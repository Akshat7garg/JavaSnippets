import java.util.Scanner;

// Program to count all possible paths from top-left to bottom-right in an m x n grid
// Allowed moves: right or down
public class CountMazePath {

    // Recursive method to count valid paths starting at position (i, j)
    public static int validPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0; // Out of bounds: no path
        }
        if (i == m - 1 && j == n - 1) {
            return 1; // Reached destination: one valid path found
        }

        // Count paths by moving right and down recursively
        int rightPath = validPaths(i, j + 1, m, n);
        int downPath = validPaths(i + 1, j, m, n);

        return rightPath + downPath; // Total paths from current position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Number of rows: ");
        int m = sc.nextInt();
        System.out.print("Number of columns: ");
        int n = sc.nextInt();

        sc.close(); // Close scanner

        System.out.println("All possible paths in the maze: " + validPaths(0, 0, m, n));
    }
}
