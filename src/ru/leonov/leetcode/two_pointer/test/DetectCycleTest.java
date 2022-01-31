package ru.leonov.leetcode.two_pointer.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.two_pointer.solution.DetectCycleTask;

public class DetectCycleTest extends AbstractTest<DetectCycleTask> {
    public DetectCycleTest() {
        super(new DetectCycleTask());
    }

    @Override
    public void run() {
        baseFlow();
        baseFlow_FullCycle();
        baseFlow_CycleIntoList();
        extremalCase_1();
        extremalCase_2();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        ListNode initNode = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        initNode.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        assertResult(node2, solution.detectCycle(initNode));
    }


    private void baseFlow_FullCycle() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow_FullCycle starting test");
        ListNode initNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        initNode.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = initNode;

        assertResult(initNode, solution.detectCycle(initNode));
    }

    private void baseFlow_CycleIntoList() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow_CycleIntoList starting test");
        ListNode initNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        initNode.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        assertResult(node3, solution.detectCycle(initNode));
    }


    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,null)
        );
        ListNode notCycleNode = null;
        assertResult(notCycleNode, solution.detectCycle(initNode));

    }

    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");
        ListNode initNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        initNode.next = node2;
        node2.next = initNode;
        assertResult(initNode, solution.detectCycle(initNode));

    }


}
