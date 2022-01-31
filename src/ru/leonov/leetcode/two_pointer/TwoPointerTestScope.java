package ru.leonov.leetcode.two_pointer;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.two_pointer.test.DetectCycleTest;

public class TwoPointerTestScope implements TestScope {
    public void detectCycle() {
        runner(new DetectCycleTest());
    }
}
