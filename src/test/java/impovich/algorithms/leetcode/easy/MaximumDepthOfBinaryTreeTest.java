package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static impovich.algorithms.leetcode.easy.BinaryTreeFactory.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MaximumDepthOfBinaryTreeTest {

    private static MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeClass
    public static void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    public static Object[] data() {
        return new Object[][]{
                {treeNodeWithMinMaxDepthOne(), 1},
                {treeNodeWithMinMaxDepthThree(), 3},
                {treeNodeWithMinDepthThreeMaxDepthSix(), 6}
        };
    }

    @Test
    @Parameters(method = "data")
    public void maxDepth(TreeNode input, int expected) {
        final int executionResult = maximumDepthOfBinaryTree.maxDepth(input);

        assertThat(executionResult, equalTo(expected));
    }
}
