package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.linked_list.model.ListNode;
import ru.leonov.leetcode.linked_list.solution.RevertListTask;

public class RevertListTaskTest extends  AbstractTest<RevertListTask> {

    public RevertListTaskTest() {
        super(new RevertListTask());
    }

    @Override
    public void run() {
        baseFlow();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6, null))
                                )
                        )
                )
        );

        ListNode expected = new ListNode(6,
                new ListNode(5,
                        new ListNode(4,
                                new ListNode(3,
                                        new ListNode(2,
                                                new ListNode(1, null))
                                )
                        )
                )
        );

        assertResult(expected, solution.reverseList(initNode));
    }
}
