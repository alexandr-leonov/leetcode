package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.ListNode;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.linked_list.solution.AddTwoNumbersTask;

public class AddTwoNumbersTaskTest extends AbstractTest<AddTwoNumbersTask> {
    public AddTwoNumbersTaskTest() {
        super(new AddTwoNumbersTask());
    }

    @Override
    public void run() {
        baseFlow();
        extremalCase_1();
        extremalCase_2();
        extremalCase_3();
        extremalCase_4();
        extremalCase_5();
    }

    /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
     */
    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        ListNode l1 = CommonUtil.buildListNode(new int[]{2,4,3});
        ListNode l2 = CommonUtil.buildListNode(new int[]{5,6,4});
        ListNode expected = CommonUtil.buildListNode(new int[]{7,0,8});
        
        assertResult(expected, solution.addTwoNumbers(l1, l2));
    }

    /*
        Input: l1 = [0], l2 = [0]
        Output: [0]
     */
    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");
        assertResult(new ListNode(), solution.addTwoNumbers(new ListNode(),new ListNode()));
    }

    /*
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
     */
    private void extremalCase_2() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_2 starting test");
        ListNode l1 = CommonUtil.buildListNode(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = CommonUtil.buildListNode(new int[]{9,9,9,9});
        ListNode expected = CommonUtil.buildListNode(new int[]{8,9,9,9,0,0,0,1});
        assertResult(expected, solution.addTwoNumbers(l1, l2));
    }

    private void extremalCase_3() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_3 starting test");
        ListNode l1 = new ListNode(9);
        ListNode l2 = CommonUtil.buildListNode(new int[]{1,9,9,9,9,9,9,9,9,9});
        ListNode expected = CommonUtil.buildListNode(new int[]{0,0,0,0,0,0,0,0,0,0,1});
        assertResult(expected, solution.addTwoNumbers(l1, l2));
    }

    private void extremalCase_4() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_4 starting test");
        ListNode l1 = CommonUtil.buildListNode(new int[]{1,1,1,1,1,1,1,1,1,1,1});
        ListNode expected = CommonUtil.buildListNode(new int[]{2,2,2,2,2,2,2,2,2,2,2});
        assertResult(expected, solution.addTwoNumbers(l1, l1));
    }

    private void extremalCase_5() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_5 starting test");
        ListNode l1 = CommonUtil.buildListNode(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        ListNode l2 = CommonUtil.buildListNode(new int[]{5,6,4});
        ListNode expected = CommonUtil.buildListNode(new int[]{6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        assertResult(expected, solution.addTwoNumbers(l1, l2));
    }

}
