package ru.leonov.leetcode.two_pointer.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

public class IntersectionListsTask extends Solution {

    /*
        Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
        If the two linked lists have no intersection at all, return null.
        https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode innerNode = headB;
        while (headA != null) {
            while (headB != null) {
                if (headA == headB) {
                    return headB;
                }
                headB = headB.next;
            }
            headA = headA.next;
            headB = innerNode;
        }

        return null;
    }
}
