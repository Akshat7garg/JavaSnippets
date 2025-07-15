import java.util.Scanner;

// Program to sort a list using Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner

        System.out.print("Enter size of the list: ");
        int size = sc.nextInt(); // Size of the array

        int list[] = new int[size];
        System.out.print("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Reading elements
        }
        sc.close(); // Closing scanner

        // Selection Sort algorithm
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i; // Assume the current index has the minimum value

            // Find the actual minimum element in the remaining array
            for (int j = i + 1; j < size; j++) {
                if (list[j] < list[minIdx]) {
                    minIdx = j; // Update index if a smaller element is found
                }
            }

            // Swap the found minimum element with the current element
            int temp = list[i];
            list[i] = list[minIdx];
            list[minIdx] = temp;
        }

        // Output the sorted list
        System.out.print("Sorted list:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
