package impovich.algorithms.easy;

import impovich.algorithms.helpers.TreeNode;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class MaximumDepthOfBinaryTreeTest {

    private static MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeClass
    public static void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @Test
    public void maxDepthOne() {
        TreeNode input = treeNodeWithMaxDepthOne();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(1));
    }

    @Test
    public void maxDepthTree() {
        TreeNode input = treeNodeWithMaxDepthThree();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(3));
    }

    @Test
    public void maxDepthSix() {
        TreeNode input = treeNodeWithMaxDepthSix();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(6));
    }

    private TreeNode treeNodeWithMaxDepthSix() {
        TreeNode root = treeNodeWithMaxDepthThree();
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

    private TreeNode treeNodeWithMaxDepthThree() {
        final TreeNode root = treeNodeWithMaxDepthOne();
        final TreeNode firstLeft = new TreeNode(1);
        root.setLeft(firstLeft);
        firstLeft.setLeft(new TreeNode(1));

        return root;
    }

    private TreeNode treeNodeWithMaxDepthOne() {
        return new TreeNode(1);
    }
}