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
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB){
            if(nodeA != null) {
                nodeA = nodeA.next;
            } else {
                nodeA = headB;
            }

            if(nodeB != null) {
                nodeB = nodeB.next;
            } else {
                nodeB = headA;
            }
        }
        return nodeA;
    }
}
