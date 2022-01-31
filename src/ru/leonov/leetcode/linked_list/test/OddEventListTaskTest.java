package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
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
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7, null)
                                                )
                                        )
                                )
                        )
                )
        );

        ListNode expected = new ListNode(1,
                new ListNode(3,
                        new ListNode(5,
                                new ListNode(7,
                                        new ListNode(2,
                                                new ListNode(4,
                                                        new ListNode(6, null)
                                                )
                                        )
                                )
                        )
                )
        );

        assertResult(expected, solution.oddEvenList(initNode));

    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(8, null)
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        ListNode expected = new ListNode(1,
                new ListNode(3,
                        new ListNode(5,
                                new ListNode(7,
                                        new ListNode(2,
                                                new ListNode(4,
                                                        new ListNode(6,
                                                                new ListNode(8, null)
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        assertResult(expected, solution.oddEvenList(initNode));
    }

}
