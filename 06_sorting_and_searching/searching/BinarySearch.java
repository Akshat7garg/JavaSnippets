import java.util.Arrays;
import java.util.Scanner;

// Program to find the index of an element in a sorted list using binary search
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter size of the list: ");
        int size = sc.nextInt(); // Read list size

        int list[] = new int[size];
        System.out.print("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Read list elements
        }

        System.out.print("Enter the element in the list whose index you want to search: ");
        int searchElement = sc.nextInt(); // Element to search
        sc.close(); // Close scanner

        Arrays.sort(list); // Ensure the list is sorted for binary search

        int idx = -1; // Variable to store index if found
        int left = 0, right = size - 1;

        // Binary Search loop
        while (left <= right) {
            int mid = left + ((right - left) / 2); // Safe mid calculation to avoid overflow

            if (list[mid] == searchElement) {
                idx = mid; // Element found
                break;
            } else if (list[mid] > searchElement) {
                right = mid - 1; // Search in left half
            } else {
                left = mid + 1; // Search in right half
            }
        }

        // Output result
        if (idx == -1) {
            System.out.println("Element is not available (present) in the list.");
        } else {
            System.out.println("Element is found at index: " + idx);
        }
    }
}
