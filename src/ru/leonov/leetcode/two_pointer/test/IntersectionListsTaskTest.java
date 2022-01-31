package ru.leonov.leetcode.two_pointer.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.two_pointer.solution.IntersectionListsTask;

public class IntersectionListsTaskTest  extends AbstractTest<IntersectionListsTask> {
    public IntersectionListsTaskTest() {
        super(new IntersectionListsTask());
    }

    @Override
    public void run() {
        baseFlow();
        notIntersect();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode firstIntersectNode = new ListNode(3, new ListNode(4));

        ListNode list1 = new ListNode(1, new ListNode(2, firstIntersectNode));
        ListNode list2 = new ListNode(-1, new ListNode(5, firstIntersectNode));


        assertResult(firstIntersectNode, solution.getIntersectionNode(list1, list2));
    }

    private void notIntersect() {
        System.out.println(this.getClass().getSimpleName() + "#notIntersect starting test");
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode list2 = new ListNode(-1, new ListNode(5, new ListNode(7, new ListNode(9))));

        assertResult(null, solution.getIntersectionNode(list1, list2));
    }
}
