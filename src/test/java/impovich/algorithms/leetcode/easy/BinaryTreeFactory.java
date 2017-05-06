package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public abstract class BinaryTreeFactory {

    public static TreeNode treeNodeWithMinDepthThreeMaxDepthSix() {
        TreeNode root = treeNodeWithMinMaxDepthThree();
        final TreeNode secondRight = new TreeNode(1);
        root.setRight(secondRight);
        final TreeNode thirdLeft = new TreeNode(1);
        secondRight.setLeft(thirdLeft);
        final TreeNode fourthLeft = new TreeNode(1);
        thirdLeft.setLeft(fourthLeft);
        final TreeNode fifthLeft = new TreeNode(1);
        fourthLeft.setLeft(fifthLeft);
        fifthLeft.setLeft(new TreeNode(1));

        return root;
    }

    public static TreeNode treeNodeWithMinMaxDepthThree() {
        final TreeNode root = treeNodeWithMinMaxDepthOne();
        final TreeNode firstLeft = new TreeNode(1);
        root.setLeft(firstLeft);
        firstLeft.setLeft(new TreeNode(1));

        return root;
    }

    public static TreeNode treeNodeWithMinMaxDepthOne() {
        return new TreeNode(1);
    }
}