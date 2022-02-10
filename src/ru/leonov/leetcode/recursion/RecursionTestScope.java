package ru.leonov.leetcode.recursion;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.recursion.test.ReverseStringTaskTest;

public class RecursionTestScope implements TestScope {

    public void revertString() {
        runner(new ReverseStringTaskTest());
    }
}
