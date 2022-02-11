package ru.leonov.leetcode.recursion.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.recursion.solution.SwapElementsTask;

public class SwapElementsTaskTest extends AbstractTest<SwapElementsTask> {


    public SwapElementsTaskTest() {
        super(new SwapElementsTask());
    }

    @Override
    public void run() {
        baseFlow();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        ListNode source = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6});
        ListNode expected = CommonUtil.buildListNode(new int[]{2,1,4,3,6,5});

        assertResult(expected, solution.swapPairs(source));
    }
}
