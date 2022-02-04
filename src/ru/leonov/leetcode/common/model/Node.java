package ru.leonov.leetcode.common.model;

import java.util.Objects;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", prev=" + prev +
                ", next=" + next +
                ", child=" + child +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val && Objects.equals(prev, node.prev) && Objects.equals(next, node.next) && Objects.equals(child, node.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, prev, next, child);
    }
};
