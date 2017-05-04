package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;

/*
https://leetcode.com/problems/minimum-depth-of-binary-tree/#/description
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
* */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.getLeft()) + 1;
        int right = minDepth(root.getRight()) + 1;

        if (left == right) return left;
        if (left == 1) return right;
        if (right == 1) return left;

        return left > right ? right : left;
    }
}
