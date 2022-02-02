package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

/*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists in a one sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
 */
public class MergeTwoSortedListsTask extends Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return head.next;
    }
}
