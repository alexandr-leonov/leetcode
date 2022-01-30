package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.linked_list.model.ListNode;

public class RemoveListTask extends Solution {

    /*
        Input: head = [1,2,6,3,4,5,6], val = 6
        Output: [1,2,3,4,5]

        Input: head = [], val = 1
        Output: []

        Input: head = [7,7,7,7], val = 7
        Output: []
     */
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
