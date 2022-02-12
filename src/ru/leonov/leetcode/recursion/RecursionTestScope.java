package ru.leonov.leetcode.recursion;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.recursion.test.BinarySearchTaskTest;
import ru.leonov.leetcode.recursion.test.ReverseStringTaskTest;
import ru.leonov.leetcode.recursion.test.SwapElementsTaskTest;

public class RecursionTestScope implements TestScope {

    public void revertString() {
        runner(new ReverseStringTaskTest());
    }

    public void swapElements() {
        runner(new SwapElementsTaskTest());
    }

    public void binarySearch() {
        runner(new BinarySearchTaskTest());
    }
}
