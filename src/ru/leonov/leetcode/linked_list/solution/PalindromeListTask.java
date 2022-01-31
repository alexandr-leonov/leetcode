package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

public class PalindromeListTask extends Solution {
    /*
        Input: head = [1,2,2,1]
        Output: true

        Input: head = [1,2]
        Output: false
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode endNode = null;
        ListNode nexNode = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        endNode = slow;
        slow = slow.next;
        endNode.next = null;

        while (slow != null) {
            nexNode = slow.next;
            slow.next = endNode;
            endNode = slow;
            slow = nexNode;
        }

        fast = head;
        slow = endNode;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}
