import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListFramework {

    // Find 1-based index of target element in list
    public static int searchIdx(LinkedList<Integer> list, int target) {
        int len = list.size();

        for (int i = 0; i < len; i++) {
            if (list.get(i) == target) {
                return i + 1;
            }
        }

        return -1;
    }

    // Remove all elements >= target from list
    public static void removeTarget(LinkedList<Integer> list, int target) {
        if (list == null)
            return;

        Iterator<Integer> lisIterator = list.iterator();
        while (lisIterator.hasNext()) {
            if (lisIterator.next() >= target) {
                lisIterator.remove();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First list
        System.out.print("How many elements you want add: ");
        int size = sc.nextInt();

        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.print("Enter all '" + size + "' elements: ");
        for (int i = 0; i < size; i++) {
            list1.addLast(sc.nextInt());
        }

        System.out.print("Which element's index you want to search: ");
        int target = sc.nextInt();

        int idx = searchIdx(list1, target);
        if (idx == -1) {
            System.out.println("Target is not present in the list.");
        } else {
            System.out.println("Index of '" + target + "' in the list: " + idx);
        }

        // Second list
        System.out.println("Now lets create another list;");
        System.out.print("How many elements you want add in new list: ");
        int newSize = sc.nextInt();

        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.print("Enter all '" + newSize + "' elements: ");
        for (int i = 0; i < newSize; i++) {
            list2.addLast(sc.nextInt());
        }

        System.out.print("Enter the element whose equal and greater value has to be remove from the list: ");
        int newTarget = sc.nextInt();

        System.out.println("List before deleting all elements greater or equal to '" + newTarget + "': " + list2);

        removeTarget(list2, newTarget);

        System.out.println("New List after deleting all elements greater or equal to '" + newTarget + "': " + list2);

        sc.close();
    }
}
