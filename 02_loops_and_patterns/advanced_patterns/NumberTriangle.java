import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print number triangle
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces to center the triangle
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to next row
        }
    }
}
