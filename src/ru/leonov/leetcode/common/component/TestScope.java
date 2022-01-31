package ru.leonov.leetcode.common.component;

public interface TestScope {
    default void runner(TaskTest test) {
        test.run();
    }
}
