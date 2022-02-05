package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.Node;

public class FlattenMultilevelLinkedListTask extends Solution {
    /*
        Рекурсивно повторяем алгоритм:
        1) Каждый дочерний список делаем продолжением списка текущего уровня.
        2) Проходим в цикла внутренний список и вставляем в хвост из родительского списка ноду,
        следовавшую после ноды с дочерним списком.
        Результат функции - голова списка каждого уровня вложенности.
     */
    public Node flatten(Node head) {
        Node result = head;
        Node headChild = null;
        Node nextAfterChild = null;
        Node backRef = null;
        while (head != null) {
            head.prev = backRef;

            headChild = head.child;
            if (head.child != null) {
                nextAfterChild = head.next;
                head.next = flatten(headChild);
                head.child = null;
                while (head.next != null) {
                    backRef = head;
                    head = head.next;
                    head.prev = backRef;
                }
                head.next = nextAfterChild;
            }
            backRef = head;
            head = head.next;
        }

        return result;
    }
}
