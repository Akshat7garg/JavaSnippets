import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: dimensions of the rectangle
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int columns = sc.nextInt();

        sc.close();

        // Print hollow rectangle pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Print '*' for borders, space for inner cells
                if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to next row
        }
    }
}
