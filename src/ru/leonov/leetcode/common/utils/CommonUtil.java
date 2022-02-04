package ru.leonov.leetcode.common.utils;

import ru.leonov.leetcode.common.model.ListNode;

public final class CommonUtil {

    public static ListNode buildListNode(int[] array) {
        if (array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode iterator = head;
        for (int i = 1; i < array.length; i ++) {
            iterator.next = new ListNode(array[i]);
            iterator = iterator.next;
        }
        return head;
    }

}
