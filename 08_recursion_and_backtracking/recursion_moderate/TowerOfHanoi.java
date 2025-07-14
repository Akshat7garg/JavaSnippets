import java.util.Scanner;

// Program to solve Tower of Hanoi problem using recursion
public class TowerOfHanoi {

    // Recursive function to move disks from src to dest using help
    public static void hanoiTower(int disk, String src, String help, String dest) {
        if (disk == 1) {
            // Base case: only one disk, move directly from src to dest
            System.out.println("Disk number " + disk + " moves from " + src + " to " + dest);
            return;
        }

        // Move top (n-1) disks from src to help using dest as temp
        hanoiTower(disk - 1, src, dest, help);

        // Move the largest disk from src to dest
        System.out.println("Disk number " + disk + " moves from " + src + " to " + dest);

        // Move the (n-1) disks from help to dest using src as temp
        hanoiTower(disk - 1, help, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter number of disks: ");
        int disk = sc.nextInt(); // Read number of disks
        sc.close(); // Close input

        System.out.println("Steps to move all disks from source to destination:");
        hanoiTower(disk, "src", "help", "dest"); // Start recursive process
    }
}
