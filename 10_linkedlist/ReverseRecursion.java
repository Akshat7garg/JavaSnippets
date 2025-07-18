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
    // Recursive function to reverse the list
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverse(head.next); // Recurse till end

        head.next.next = head; // Reverse the pointer
        head.next = null; // Break the original link

        return newHead; // Return new head
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
}
