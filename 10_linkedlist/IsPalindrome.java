// https://leetcode.com/problems/palindrome-linked-list/description/

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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) 
            return true;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head;

        // Reverse first half while finding the middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Skip middle node for odd-length lists
        if (fast != null) {
            curr = curr.next;
        }

        // Compare reversed first half with second half
        while (curr != null) {
            if (prev.val != curr.val) return false;
            prev = prev.next;
            curr = curr.next;
        }

        return true;
    }
}
