import java.util.Scanner;

public class LinkedListManual<E extends Comparable<E>> {

    // Node class to represent each element in the linked list
    class ListNode {
        E val; // Data stored in the node
        ListNode next; // Pointer to the next node

        // Constructor for node with only value
        ListNode(E val) {
            this.val = val;
        }

        // Constructor for node with value and next node
        ListNode(E val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Head pointer for the list
    private ListNode head;

    // Variable to track the number of elements
    private int size;

    // Adds a new node at the beginning of the list
    public void addFirst(E data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Adds a new node at the end of the list
    public void addLast(E data) {
        ListNode newNode = new ListNode(data);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Adds a new node in the middle of the list
    public void addMiddle(E data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (head.next == null) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        int idx = size / 2;
        ListNode currNode = head;

        // Traverse to one node before middle
        for (int i = 0; i < idx; i++) {
            if (i == idx - 1) {
                ListNode tempNode = currNode.next;
                newNode.next = tempNode;
                currNode.next = newNode;
                break;
            }
            currNode = currNode.next;
        }

        size++;
    }

    // Deletes the first node of the list
    public void deleteFirst() {
        if (head == null || head.next == null) {
            head = null;
            size = 0;
            return;
        }

        head = head.next;
        size--;
    }

    // Deletes the last node of the list
    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            size = 0;
            return;
        }

        ListNode currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }

        currNode.next = null;
        size--;
    }

    // Prints all elements in the list
    public void printList() {
        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.val + " --> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // Returns the number of elements in the list
    public int getSize() {
        return size;
    }

    // Clears the entire list
    public void clear() {
        head = null;
        size = 0;
    }

    // Checks whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Searches for a given element and returns its 1-based index
    public int searchIdx(E target) {
        int idx = 0;
        ListNode currNode = head;

        while (currNode != null) {
            if (currNode.val.compareTo(target) == 0) {
                return idx + 1; // Return 1-based index
            }
            currNode = currNode.next;
            idx++;
        }

        return -1; // Not found
    }

    // Removes all nodes with value >= target
    public void removeTarget(E target) {
        if (head == null)
            return;

        // Remove all head nodes >= target
        while (head != null && head.val.compareTo(target) >= 0) {
            head = head.next;
            size--;
        }

        // Remove matching nodes in the rest of the list
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.val.compareTo(target) >= 0) {
                currNode.next = currNode.next.next;
                size--;
            } else {
                currNode = currNode.next;
            }
        }
    }

    // Main method to demonstrate usage of the LinkedListManual class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First list operations
        System.out.print("How many elements you want add: ");
        int size = sc.nextInt();

        LinkedListManual<Integer> operation1 = new LinkedListManual<>();
        System.out.print("Enter all '" + size + "' elements: ");
        for (int i = 0; i < size; i++) {
            operation1.addLast(sc.nextInt());
        }

        System.out.print("Which element's index you want to search: ");
        int target = sc.nextInt();

        int idx = operation1.searchIdx(target);
        if (idx == -1) {
            System.out.println("Target is not present in the list.");
        } else {
            System.out.println("Index of '" + target + "' in the list: " + idx);
        }

        // Second list operations
        System.out.println("Now lets create another list;");
        System.out.print("How many elements you want add in new list: ");
        int newSize = sc.nextInt();

        LinkedListManual<Integer> operation2 = new LinkedListManual<>();
        System.out.print("Enter all '" + newSize + "' elements: ");
        for (int i = 0; i < newSize; i++) {
            operation2.addLast(sc.nextInt());
        }

        System.out.print("Enter the element whose equal and greater value has to be remove from the list: ");
        int newTarget = sc.nextInt();

        System.out.println("List before deleting all elements greater or equal to '" + newTarget + "': ");
        operation2.printList();

        operation2.removeTarget(newTarget);

        System.out.println("New List after deleting all elements greater or equal to '" + newTarget + "': ");
        operation2.printList();

        sc.close();
    }
}
