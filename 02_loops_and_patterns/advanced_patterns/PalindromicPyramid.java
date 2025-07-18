import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print palindromic pyramid
        for (int i = 1; i <= rows; i++) {
            // Leading spaces for center alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to next row
        }
    }
}
