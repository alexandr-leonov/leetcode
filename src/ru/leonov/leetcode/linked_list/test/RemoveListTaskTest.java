package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.linked_list.solution.RemoveListTask;

public class RemoveListTaskTest extends AbstractTest<RemoveListTask> {

    public RemoveListTaskTest() {
        super(new RemoveListTask());
    }

    @Override
    public void run() {
        baseFlow();
        extremalCase_1();
        extremalCase_2();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6});
        ListNode expected = CommonUtil.buildListNode(new int[]{1,2,3,4,5});

        assertResult(expected, solution.removeElements(initNode, 6));

    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{7,7,7,7,7});

        assertResult(null, solution.removeElements(initNode, 7));
    }

    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2});
        ListNode expected = new ListNode(2, null);

        assertResult(expected, solution.removeElements(initNode, 1));
    }

}
