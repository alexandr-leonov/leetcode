package ru.leonov.leetcode.two_pointer;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.two_pointer.test.DetectCycleTest;
import ru.leonov.leetcode.two_pointer.test.IntersectionListsTaskTest;
import ru.leonov.leetcode.two_pointer.test.RemoveNElementFromEndListTaskTest;

public class TwoPointerTestScope implements TestScope {
    public void detectCycle() {
        runner(new DetectCycleTest());
    }

    public void intersectionLists() {
        runner(new IntersectionListsTaskTest());
    }

    public void removeNElementFromEndList() {
        runner(new RemoveNElementFromEndListTaskTest());
    }

}
