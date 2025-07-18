import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print number pyramid
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print row number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println(); // Move to next row
        }
    }
}
