package impovich.algorithms.leetcode.easy;

import impovich.algorithms.leetcode.helpers.TreeNode;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static impovich.algorithms.leetcode.easy.BinaryTreeFactory.treeNodeWithMinDepthThreeMaxDepthSix;
import static impovich.algorithms.leetcode.easy.BinaryTreeFactory.treeNodeWithMinMaxDepthOne;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MinimumDepthOfBinaryTreeTest {

    private static MinimumDepthOfBinaryTree minimumDepthOfBinaryTree;

    @BeforeClass
    public static void setUp() {
        minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
    }

    public static Object[] data() {
        return new Object[][]{
                {treeNodeWithMinMaxDepthOne(), 1},
                {treeNodeWithMinDepthThreeMaxDepthSix(), 3}
        };
    }

    @Test
    @Parameters(method = "data")
    public void minDepthOne(TreeNode input, int expected) {
        final int executionResult = minimumDepthOfBinaryTree.minDepth(input);

        assertThat(executionResult, equalTo(expected));
    }

}