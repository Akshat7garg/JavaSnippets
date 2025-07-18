import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Print filled parallelogram
        for (int i = 1; i <= rows; i++) {
            // Leading spaces to shift the row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print stars for each row
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Next line
        }
    }
}
