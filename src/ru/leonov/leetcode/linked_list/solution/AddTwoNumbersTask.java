package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

import java.math.BigInteger;

public class AddTwoNumbersTask extends Solution {
    /*
        You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order, and each of their nodes contains a single digit.
        Add the two numbers and return the sum as a linked list.
        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode head = resultNode;
        int sum = 0;
        int newTenCount = 0;
        int sumResult = 0;
        int resultInOldTen = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + newTenCount;
            sumResult = sum / 10;
            if (sumResult != 0) {
                newTenCount = sumResult;
            } else {
                newTenCount = 0;
            }

            resultInOldTen = sum % 10;
            resultNode.next = new ListNode(resultInOldTen);
            resultNode = resultNode.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + newTenCount;
            sumResult = sum / 10;
            if (sumResult != 0) {
                newTenCount = sumResult;
            } else {
                newTenCount = 0;
            }
            resultInOldTen = sum % 10;
            resultNode.next = new ListNode(resultInOldTen);
            resultNode = resultNode.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + newTenCount;
            sumResult = sum / 10;
            if (sumResult != 0) {
                newTenCount = sumResult;
            } else {
                newTenCount = 0;
            }
            resultInOldTen = sum % 10;
            resultNode.next = new ListNode(resultInOldTen);
            resultNode = resultNode.next;
            l2 = l2.next;
        }

        if (newTenCount != 0) {
            resultNode.next = new ListNode(newTenCount);
        }


        return head.next;

    }
}
