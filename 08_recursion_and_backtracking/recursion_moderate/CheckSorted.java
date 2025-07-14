import java.util.Scanner;

// Program to check if an array is sorted in ascending order using recursion
public class CheckSorted {

    // Recursive method to check sorting starting from index idx
    public static boolean isSorted(int arr[], int idx, int size) {
        if (idx == size - 1) {
            return true; // Base case: reached the end without issues
        }

        if (arr[idx] > arr[idx + 1])
            return false; // Current element greater than next → not sorted

        if (!isSorted(arr, idx + 1, size))
            return false; // Recursively check the rest of the array

        return true; // All checks passed → sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter size of list: ");
        int size = sc.nextInt(); // Read array size

        int list[] = new int[size];
        System.out.print("Enter all '" + size + "' elements in list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Read elements
        }

        sc.close(); // Close scanner

        if (isSorted(list, 0, size)) {
            System.out.println("Given list is sorted in ascending order");
        } else {
            System.out.println("Given list is not sorted in ascending order");
        }
    }
}
