package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.linked_list.solution.RevertListTask;

public class RevertListTaskTest extends AbstractTest<RevertListTask> {

    public RevertListTaskTest() {
        super(new RevertListTask());
    }

    @Override
    public void run() {
        baseFlow();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6});
        ListNode expected = CommonUtil.buildListNode(new int[]{6,5,4,3,2,1});

        assertResult(expected, solution.reverseList(initNode));
    }
}
