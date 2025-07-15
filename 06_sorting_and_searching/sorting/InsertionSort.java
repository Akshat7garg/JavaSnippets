import java.util.Scanner;

// Program to sort a list using Insertion Sort
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        System.out.print("Enter size of the list: ");
        int size = sc.nextInt(); // Read size of the list

        int list[] = new int[size];
        System.out.print("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Read list elements
        }
        sc.close(); // Close scanner

        // Insertion Sort algorithm
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int currElement = list[i]; // Element to be placed in correct position

            // Shift elements greater than currElement one step to the right
            while (j >= 0 && list[j] > currElement) {
                list[j + 1] = list[j];
                j--;
            }

            // Place currElement at its correct sorted position
            list[j + 1] = currElement;
        }

        // Print sorted array
        System.out.print("Sorted list:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
