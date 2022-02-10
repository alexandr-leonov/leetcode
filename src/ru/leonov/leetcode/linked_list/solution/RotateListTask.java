package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.ListNode;

public class RotateListTask extends Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Убираем граничные случаи
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        // Находим последний k элемент с конца
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            if (fast == null) {
                fast = head;
            }
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }


        ListNode end = slow;
        // После того, как последний элемент найден заполняем новый массив с фейковой головы последними элементами
        ListNode result = new ListNode();
        ListNode it = result;
        while (slow != null) {
            it.next = slow;
            slow = slow.next;
            it = it.next;
        }
        // Затем добавляем начальные элементы, пока не встретим последний k-ый элемент с конца
        ListNode joinPoint = head;
        it.next = joinPoint;
        while (head.next != end) {
            head = head.next;
        }

        // Зануляем список после последнего k-элемента с конца
        head.next = null;

        // Возвращаем список, без учёта фейковой головы
        return result.next;

    }
}
