package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.linked_list.model.ListNode;

public class OddEventListTask extends Solution {
    /*
        Input: head = [1,2,3,4,5]
        Output: [1,3,5,2,4]

        Input: head = [2,1,3,5,6,4,7]
        Output: [2,3,6,7,1,5,4]
     */
    public ListNode oddEvenList(ListNode head) {
        ListNode oddInitNode = null;
        ListNode oddNode = null;
        ListNode evenInitNode = null;
        ListNode evenNode = null;
        boolean isOdd = true;
        while (head!= null) {
            ListNode nextNode = head.next;
            if (isOdd) {
                if (oddNode == null) {
                    oddNode = new ListNode(head.val);
                    oddInitNode = oddNode;
                } else {
                    oddNode.next = new ListNode(head.val);
                    oddNode = oddNode.next;
                }
            } else {
                if (evenNode == null) {
                    evenNode = new ListNode(head.val);
                    evenInitNode = evenNode;
                } else {
                    evenNode.next = new ListNode(head.val);
                    evenNode = evenNode.next;
                }
            }
            head = nextNode;
            isOdd = !isOdd;
        }

        if (oddNode != null) {
            oddNode.next = evenInitNode;
        }

        return oddInitNode;
    }
}
