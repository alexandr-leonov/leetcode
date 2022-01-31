package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.linked_list.solution.PalindromeListTask;

public class PalindromeListTaskTest extends AbstractTest<PalindromeListTask> {

    public PalindromeListTaskTest() {
        super(new PalindromeListTask());
    }

    @Override
    public void run() {
        positiveFlow();
        negativeFlow();
        extremalCase_1();
    }

    private void positiveFlow() {
        System.out.println(this.getClass().getSimpleName() + "#positiveFlow starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(3,
                                                new ListNode(2,
                                                        new ListNode(1, null)
                                                )
                                        )
                                )
                        )
                )
        );

        assertResult(true, solution.isPalindrome(initNode));
    }

    private void negativeFlow() {
        System.out.println(this.getClass().getSimpleName() + "#negativeFlow starting test");
        ListNode initNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(3,
                                                new ListNode(2,
                                                        new ListNode(2, null)
                                                )
                                        )
                                )
                        )
                )
        );

        assertResult(false, solution.isPalindrome(initNode));
    }

    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        ListNode initNode = new ListNode(1, null);

        assertResult(true, solution.isPalindrome(initNode));
    }
}
