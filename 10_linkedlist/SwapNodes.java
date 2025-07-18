// https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to traverse and perform swaps
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            // Identify two nodes to swap
            ListNode first = prev.next;
            ListNode second = first.next;

            // Perform swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move pointer for next pair
            prev = first;
        }

        return dummy.next;
    }
}
