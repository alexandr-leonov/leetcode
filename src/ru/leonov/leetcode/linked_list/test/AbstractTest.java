package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.linked_list.solution.Solution;

public abstract class AbstractTest<T extends Solution> implements TaskTest {
    protected T solution;
    public AbstractTest(T solution) {
        this.solution = solution;
    }
}
