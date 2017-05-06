package impovich.algorithms.leetcode.easy;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 06/05/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ReshapeTheMatrixTest {

    private static ReshapeTheMatrix reshapeTheMatrix;

    @BeforeClass
    public static void setUp() {
        reshapeTheMatrix = new ReshapeTheMatrix();
    }

    public static Object[] data() {
        return new Object[][]{
                {new int[][]{{1, 2}, {3, 4}}, 1, 4, new int[][]{{1, 2, 3, 4}}},
                {new int[][]{{1, 2, 3}, {4, 5, 6}}, 3, 2, new int[][]{{1, 2}, {3, 4}, {5, 6}}},
                //There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
                {new int[][]{{1, 2}, {3, 4}}, 2, 4, new int[][]{{1, 2}, {3, 4}}}
        };
    }

    @Test
    @Parameters(method = "data")
    public void matrixReshape(int[][] input, int row, int column, int[][] expected) {
        final int[][] executionResult = reshapeTheMatrix.matrixReshape(input, row, column);

        assertThat(executionResult, equalTo(expected));
    }

}