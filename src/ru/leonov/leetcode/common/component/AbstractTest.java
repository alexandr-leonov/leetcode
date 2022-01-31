package ru.leonov.leetcode.common.component;

public abstract class AbstractTest<T extends Solution> implements TaskTest {
    protected T solution;
    public AbstractTest(T solution) {
        this.solution = solution;
    }
}
