package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class MaximumDepthOfBinaryTreeTest extends AbstractBinaryTreeTest {

    private static MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeClass
    public static void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @Test
    public void maxDepthOne() {
        TreeNode input = treeNodeWithMinMaxDepthOne();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(1));
    }

    @Test
    public void maxDepthTree() {
        TreeNode input = treeNodeWithMinMaxDepthThree();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(3));
    }

    @Test
    public void maxDepthSix() {
        TreeNode input = treeNodeWithMinDepthThreeMaxDepthSix();
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(6));
    }

}