// https://leetcode.com/problems/reverse-linked-list-ii/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) 
            return head;

        int idx = 1;
        ListNode leftNode = new ListNode(0, head); // dummy node before head
        ListNode dummy = leftNode;
        ListNode beforeCurr = head;
        ListNode currNode = head.next;

        while (idx < right) {
            if (idx >= left && idx < right) {
                // Insert currNode right after dummy (reversing)
                beforeCurr.next = currNode.next;
                currNode.next = dummy.next;
                dummy.next = currNode;
                currNode = beforeCurr.next;
            } else {
                // Move forward until reaching 'left'
                currNode = currNode.next;
                beforeCurr = beforeCurr.next;
                dummy = dummy.next;
            }
            idx++;
        }

        return leftNode.next;
    }
}
