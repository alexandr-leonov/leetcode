package ru.leonov.leetcode.recursion.solution;

import ru.leonov.leetcode.common.component.Solution;
import ru.leonov.leetcode.common.model.TreeNode;


public class BinarySearchTask extends Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (root.val == val) {
            return root;
        } else if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
