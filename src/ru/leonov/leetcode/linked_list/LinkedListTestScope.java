package ru.leonov.leetcode.linked_list;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.linked_list.test.OddEventListTaskTest;
import ru.leonov.leetcode.linked_list.test.PalindromeListTaskTest;
import ru.leonov.leetcode.linked_list.test.RemoveListTaskTest;
import ru.leonov.leetcode.linked_list.test.RevertListTaskTest;

public class LinkedListTestScope implements TestScope {
    public void revertList() {
        runner(new RevertListTaskTest());
    }

    public void removeList() {
        runner(new RemoveListTaskTest());
    }

    public void oddEventList() {
        runner(new OddEventListTaskTest());
    }

    public void palindromeList() {
        runner(new PalindromeListTaskTest());
    }

}
