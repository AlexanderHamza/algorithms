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
 *         created 04/05/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class HammingDistanceTest {

    private static HammingDistance hammingDistance;

    @BeforeClass
    public static void setUp() {
        hammingDistance = new HammingDistance();
    }

    public static Object[] data() {
        return new Object[][]{
                {1, 4, 2},
                {3, 1, 1},
                {10, 100500, 8}
        };
    }

    @Test
    @Parameters(method = "data")
    public void hammingDistance(int firstArg, int secondArg, int expected) {
        final int executionResult = hammingDistance.hammingDistance(firstArg, secondArg);

        assertThat(executionResult, equalTo(expected));
    }

}