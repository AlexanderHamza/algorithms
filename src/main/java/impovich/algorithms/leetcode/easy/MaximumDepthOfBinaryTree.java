package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
* */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = 1 + maxDepth(root.getLeft());
        int right = 1 + maxDepth(root.getRight());

        return left > right ? left : right;
    }
}
