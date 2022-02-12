package ru.leonov.leetcode.recursion.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.TreeNode;
import ru.leonov.leetcode.recursion.solution.BinarySearchTask;

public class BinarySearchTaskTest extends AbstractTest<BinarySearchTask> {
    public BinarySearchTaskTest() {
        super(new BinarySearchTask());
    }

    @Override
    public void run() {
        baseFlow();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        TreeNode expected = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        TreeNode source = new TreeNode(4, expected, new TreeNode(7, null, null));

        assertResult(expected, solution.searchBST(source, 2));
    }
}
