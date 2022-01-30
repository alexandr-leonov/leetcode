package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.linked_list.model.ListNode;
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

        ListNode expected = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)
                                )
                        )
                )
        );

        assertResult(expected, solution.removeElements(initNode, 6));

    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        ListNode initNode = new ListNode(7,
                new ListNode(7,
                        new ListNode(7,
                                new ListNode(7,
                                        new ListNode(7,
                                                new ListNode(7, null))
                                )
                        )
                )
        );

        assertResult(null, solution.removeElements(initNode, 7));
    }

    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        null
                )
        );
        ListNode expected = new ListNode(2, null);

        assertResult(expected, solution.removeElements(initNode, 1));
    }

}
