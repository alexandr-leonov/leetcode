package ru.leonov.leetcode.linked_list;

import ru.leonov.leetcode.linked_list.test.*;

public class LinkedListTestScope {
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

    private void runner(TaskTest test) {
        test.run();
    }

}
