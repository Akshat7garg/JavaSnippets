import java.util.Scanner;

// Program to calculate the total combined length of multiple names entered by the user
public class CombinedLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("How many names you want to enter: ");
        int size = sc.nextInt(); // Read number of names

        String[] names = new String[size]; // Array to store names

        System.out.println("Enter all '" + size + "' names: ");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next(); // Read each name (single word)
        }

        sc.close(); // Close input

        int combinedLength = 0; // Initialize total length

        // Add length of each name to combinedLength
        for (String name : names) {
            combinedLength += name.length();
        }

        System.out.print("Combined length of all names: " + combinedLength); // Output result
    }
}
