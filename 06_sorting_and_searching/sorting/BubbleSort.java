import java.util.Scanner;

// Program to sort a list using Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter size of the list: ");
        int size = sc.nextInt(); // Read list size

        int list[] = new int[size];
        System.out.print("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Read each element
        }
        sc.close(); // Close scanner

        // Bubble Sort algorithm
        // Outer loop for passes
        for (int i = 0; i < size - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < size - i - 1; j++) {
                // Swap if current element is greater than the next
                if (list[j] > list[j + 1]) {
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted list:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
