import java.util.Scanner;

// Program to count ways to tile a 2 x m floor using 2 x n tiles
public class TilingProblem {

    // Recursive method to count ways to cover length m using tiles of length n
    public static int tilePlacement(int m, int n) {
        if (m == n) {
            return 2; // Either place tiles all vertically or all horizontally
        }
        if (m < n) {
            return 1; // Only vertical placement possible when floor smaller than tile length
        }

        // Place tile vertically and reduce length by 1
        int horizontalTiles = tilePlacement(m - 1, n);

        // Place tile horizontally and reduce length by n
        int verticalTiles = tilePlacement(m - n, n);

        return verticalTiles + horizontalTiles; // Total ways
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Number of rows: ");
        int m = sc.nextInt();
        System.out.print("Number of columns: ");
        int n = sc.nextInt();

        sc.close(); // Close scanner

        System.out.println("All possible ways to place (1 x " + n + ") size tiles: " + tilePlacement(m, n));
    }
}
