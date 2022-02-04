package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.linked_list.solution.OddEventListTask;

public class OddEventListTaskTest extends AbstractTest<OddEventListTask> {

    public OddEventListTaskTest() {
        super(new OddEventListTask());
    }

    @Override
    public void run() {
        baseFlow();
        extremalCase_1();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6,7});
        CommonUtil.buildListNode(new int[]{1,3,5,7,2,4,6});
        ListNode expected = CommonUtil.buildListNode(new int[]{1,3,5,7,2,4,6});

        assertResult(expected, solution.oddEvenList(initNode));

    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6,7,8});
        ListNode expected = CommonUtil.buildListNode(new int[]{1,3,5,7,2,4,6,8});

        assertResult(expected, solution.oddEvenList(initNode));
    }

}
