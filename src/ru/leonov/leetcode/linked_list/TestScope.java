package ru.leonov.leetcode.linked_list;

import ru.leonov.leetcode.linked_list.test.OddEventListTaskTest;
import ru.leonov.leetcode.linked_list.test.RemoveListTaskTest;
import ru.leonov.leetcode.linked_list.test.RevertListTaskTest;
import ru.leonov.leetcode.linked_list.test.TaskTest;

public class TestScope {
    public void revertList() {
        runner(new RevertListTaskTest());
    }

    public void removeList() {
        runner(new RemoveListTaskTest());
    }

    public void oddEventList() {
        runner(new OddEventListTaskTest());
    }

    private void runner(TaskTest test) {
        test.run();
    }

}
