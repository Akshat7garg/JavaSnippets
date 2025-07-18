import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();

        sc.close();
        int num = 1; // Starting number

        // Print Floyd's Triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment number after each print
            }
            System.out.println(); // Move to next row
        }
    }
}
