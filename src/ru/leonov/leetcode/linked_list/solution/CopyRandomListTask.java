package ru.leonov.leetcode.linked_list.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.RandomNode;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomListTask extends Solution {
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) return null;

        Map<RandomNode,RandomNode> map = new HashMap<>();

        RandomNode node = head;
        while (node != null) {
            map.put(node, new RandomNode(node.val));
            node = node.next;
        }


        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}
