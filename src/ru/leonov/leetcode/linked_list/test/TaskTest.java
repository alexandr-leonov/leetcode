package ru.leonov.leetcode.linked_list.test;

public interface TaskTest {
    void run();

    default void assertResult(Object expected, Object actual) {
        if (
                (expected == null && actual != null) || (actual == null && expected != null)
            || (expected != null && actual != null && !expected.equals(actual))
        ) {
            throw new AssertionError(String.format("Expected [%s] not equal actual [%s]", expected, actual));
        }
    }
}
