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
 *         created 13/05/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ArrayPartitionITest {

    private static ArrayPartitionI arrayPartitionI;

    @BeforeClass
    public static void setUp() {
        arrayPartitionI = new ArrayPartitionI();
    }

    public static Object[] data() {
        return new Object[][]{
                {null, 0},
                {new int[]{}, 0},
                {new int[]{1}, 0},
                {new int[]{1, 2}, 1},
                {new int[]{1, 2, 3}, 0},
                {new int[]{1, 4, 3, 2}, 4},
                {new int[]{1, 4, 3, 2, 6, 8, 7, 5}, 16}

        };
    }

    @Test
    @Parameters(method = "data")
    public void arrayPairSum(int[] input, int expected) {
        final int executionResult = arrayPartitionI.arrayPairSum(input);

        assertThat(executionResult, equalTo(expected));
    }

}