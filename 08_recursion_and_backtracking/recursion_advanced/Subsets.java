import java.util.ArrayList;
import java.util.Scanner;

// Program to print all subsets of first n natural numbers using recursion
public class Subsets {

    // Recursive method to find subsets
    // curr: current number to consider
    // num: upper limit number
    // subset: current subset being constructed
    public static void findSubsets(int curr, int num, ArrayList<Integer> subset) {
        if (curr > num) {
            // Base case: all numbers considered, print current subset
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }

        // Include current number in subset
        subset.add(curr);
        findSubsets(curr + 1, num, subset);

        // Backtrack: remove current number and explore subsets without it
        subset.remove(subset.size() - 1);
        findSubsets(curr + 1, num, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read number
        sc.close(); // Close scanner

        System.out.println("Subsets of first '" + num + "' natural numbers: ");
        findSubsets(1, num, new ArrayList<>()); // Start recursion with empty subset
    }
}
