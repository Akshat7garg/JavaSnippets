import java.util.Scanner;

public class HollowParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows (also used as columns)
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print hollow parallelogram pattern
        for (int i = 1; i <= rows; i++) {
            // Leading spaces for shifting the shape
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Stars and spaces in each row
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || j == 1 || j == rows || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(); // Move to next row
        }
    }
}
