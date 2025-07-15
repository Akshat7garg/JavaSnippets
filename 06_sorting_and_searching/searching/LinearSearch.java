import java.util.Scanner;

// Program to perform Linear Search on a list
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter size of the list: ");
        int size = sc.nextInt(); // Read list size

        int list[] = new int[size];
        System.out.print("Enter the elements in the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt(); // Read elements into array
        }

        System.out.print("Enter the element in the list whose index you want to search: ");
        int searchElement = sc.nextInt(); // Element to search
        sc.close(); // Close scanner

        int idx = -1; // Index of found element, -1 means not found

        // Linear search loop — check each element one by one
        for (int i = 0; i < size; i++) {
            if (list[i] == searchElement) {
                idx = i; // Element found at index i
                break; // Exit loop once found
            }
        }

        // Print result
        if (idx == -1) {
            System.out.println("Element is not available (present) in the list.");
        } else {
            System.out.println("Element is found at index: " + idx);
        }
    }
}
