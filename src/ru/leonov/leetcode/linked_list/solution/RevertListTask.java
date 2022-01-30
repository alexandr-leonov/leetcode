package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.linked_list.model.ListNode;

public class RevertListTask extends Solution {

    /*
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

}
