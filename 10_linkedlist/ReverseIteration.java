// https://leetcode.com/problems/reverse-linked-list/description/

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Will become new head
        ListNode curr = head; // Current node being processed

        while (curr != null) {
            ListNode nextNode = curr.next; // Save next node

            curr.next = prev; // Reverse pointer
            prev = curr; // Move prev forward
            curr = nextNode; // Move curr forward
        }

        return prev; // New head after reversal
    }
}
