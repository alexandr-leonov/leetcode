package ru.leonov.leetcode.two_pointer.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

public class DetectCycleTask extends Solution {
    /*
        Given the head of a linked list, return the node where the cycle begins.
        If there is no cycle, return null.
        https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}
