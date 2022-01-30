package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.linked_list.model.ListNode;

public class RemoveListTask {

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode initState = null;
        while (head != null) {
            if (head.val == val) {
                ListNode nextNode = head.next;
                if (prev != null) {
                    prev.next = nextNode;
                }
                head = nextNode;
            } else {
                ListNode nextNode = head.next;
                if (prev == null) {
                    initState = head;
                }
                prev = head;
                head = nextNode;

            }

        }
        return initState;
    }

}
