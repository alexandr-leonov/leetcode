package ru.leonov.leetcode.linked_list;

import ru.leonov.leetcode.linked_list.test.RemoveListTaskTest;
import ru.leonov.leetcode.linked_list.test.TaskTest;

public class TestScope {
    public void revertList() {
        runner(new RemoveListTaskTest());
    }

    public void removeList() {
        runner(new RemoveListTaskTest());
    }

    private void runner(TaskTest test) {
        test.run();
    }

}
