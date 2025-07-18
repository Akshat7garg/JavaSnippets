// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) 
            return null;

        // First pass to get total length
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // If removing the head
        if (size == n) return head.next;

        // Second pass to stop before target
        ListNode curr = head;
        for (int i = 1; i < size - n; i++) {
            curr = curr.next;
        }

        // Remove the node
        curr.next = curr.next.next;

        return head;
    }
}
