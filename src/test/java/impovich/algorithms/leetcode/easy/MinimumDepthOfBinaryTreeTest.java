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
public class MinimumDepthOfBinaryTreeTest extends AbstractBinaryTreeTest {

    private static MinimumDepthOfBinaryTree minimumDepthOfBinaryTree;

    @BeforeClass
    public static void setUp() {
        minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
    }

    @Test
    public void minDepthOne() {
        final TreeNode root = treeNodeWithMinMaxDepthOne();
        final int executionResult = minimumDepthOfBinaryTree.minDepth(root);

        assertThat(executionResult, equalTo(1));
    }

    @Test
    public void minDepthThree() {
        final TreeNode root = treeNodeWithMinDepthThreeMaxDepthSix();
        final int executionResult = minimumDepthOfBinaryTree.minDepth(root);

        assertThat(executionResult, equalTo(3));
    }

}