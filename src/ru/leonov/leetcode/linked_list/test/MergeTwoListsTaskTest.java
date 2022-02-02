package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.linked_list.solution.MergeTwoSortedListsTask;

public class MergeTwoListsTaskTest extends AbstractTest<MergeTwoSortedListsTask> {
    public MergeTwoListsTaskTest() {
        super(new MergeTwoSortedListsTask());
    }

    @Override
    public void run() {
        baseFlow();
        extremalCase_1();
        extremalCase_2();
        extremalCase_3();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        ListNode first = new ListNode(1,
                new ListNode(3,
                        new ListNode(5,
                                new ListNode(8,
                                        new ListNode(9)
                                )
                        )
                )
        );

        ListNode second = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)
                )
        );

        ListNode expected = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(8,
                                                                new ListNode(9)
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        assertResult(expected, solution.mergeTwoLists(first, second));
        System.out.println("second case");
        assertResult(expected, solution.mergeTwoLists(second, first));
    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        ListNode first = null;
        ListNode second = null;
        ListNode expected = null;
        assertResult(expected, solution.mergeTwoLists(first, second));
    }

    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");
        ListNode expected = new ListNode(1);

        ListNode first = expected;
        ListNode second = null;
        assertResult(expected, solution.mergeTwoLists(first, second));
        System.out.println("second case");
        first = null;
        second = expected;
        assertResult(expected, solution.mergeTwoLists(second, first));
    }

    private void extremalCase_3() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_3 starting test");
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

        ListNode first = new ListNode(5);
        ListNode second = new ListNode(1, new ListNode(2, new ListNode(4)));
        assertResult(expected, solution.mergeTwoLists(first, second));
        System.out.println("second case");
        assertResult(expected, solution.mergeTwoLists(second, first));
    }
}
