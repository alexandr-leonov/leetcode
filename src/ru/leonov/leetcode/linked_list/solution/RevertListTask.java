package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.linked_list.model.ListNode;

public class RevertListTask {

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
