package ru.leonov.leetcode.two_pointer.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.two_pointer.solution.RemoveNElementFromEndListTask;

public class RemoveNElementFromEndListTaskTest extends AbstractTest<RemoveNElementFromEndListTask> {
    public RemoveNElementFromEndListTaskTest() {
        super(new RemoveNElementFromEndListTask());
    }

    @Override
    public void run() {
        baseFlow();
        baseFlow_2();
        extremalCase_1();
        extremalCase_2();
        extremalCase_3();
        extremalCase_4();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5,6,7,8,9});
        ListNode expected = CommonUtil.buildListNode(new int[]{1,2,3,4,5,7,8,9});

        assertResult(expected, solution.removeNthFromEnd(initNode, 4));
    }

    private void baseFlow_2() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow_2 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3,4,5});
        ListNode expected = CommonUtil.buildListNode(new int[]{1,2,3,5});


        assertResult(expected, solution.removeNthFromEnd(initNode, 2));
    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");

        ListNode initNode = new ListNode(1);

        assertResult(null, solution.removeNthFromEnd(initNode, 1));
    }

    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2});

        assertResult(new ListNode(1), solution.removeNthFromEnd(initNode, 1));
    }

    private void extremalCase_3() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_3 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2});

        assertResult(new ListNode(2), solution.removeNthFromEnd(initNode, 2));
    }

    private void extremalCase_4() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_4 starting test");

        ListNode initNode = CommonUtil.buildListNode(new int[]{1,2,3});

        assertResult(new ListNode(2, new ListNode(3)), solution.removeNthFromEnd(initNode, 3));
    }
}
