package ru.leonov.leetcode.common.utils;

import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.model.Node;

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

    public static Node buildFlatList(int [] array) {
        if (array.length == 0) {
            return null;
        }
        Node head = new Node();
        head.val = array[0];
        Node iterator = head;
        for (int i = 1; i < array.length; i ++) {
            iterator.next = new Node();
            iterator.next.val = array[i];
            iterator.next.prev = iterator;
            iterator = iterator.next;
        }
        return head;
    }

}
