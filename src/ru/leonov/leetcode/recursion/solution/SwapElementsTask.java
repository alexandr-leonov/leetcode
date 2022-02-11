package ru.leonov.leetcode.recursion.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

/* *
 * Input: head = [1,2,3,4,5,6]
 * Output: [2,1,4,3,6,5]
 * */
public class SwapElementsTask extends Solution {
    public ListNode swapPairs(ListNode head) {
        swap(head);
        return head;
    }

    private void swap(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int tmp = head.val;
        head.val = head.next.val;
        head.next.val = tmp;
        swap(head.next.next);
    }
}
