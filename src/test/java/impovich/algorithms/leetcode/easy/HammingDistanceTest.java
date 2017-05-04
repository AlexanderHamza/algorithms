package impovich.algorithms.leetcode.easy;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class HammingDistanceTest {

    private static HammingDistance hammingDistance;

    @BeforeClass
    public static void setUp() {
        hammingDistance = new HammingDistance();
    }

    @Test
    public void hammingDistanceTwo() {
        final int executionResult = hammingDistance.hammingDistance(1, 4);

        assertThat(executionResult, equalTo(2));
    }

    @Test
    public void hammingDistanceOne() {
        final int executionResult = hammingDistance.hammingDistance(3, 1);

        assertThat(executionResult, equalTo(1));
    }

    @Test
    public void hammingDistanceEight() {
        final int executionResult = hammingDistance.hammingDistance(10, 100500);

        assertThat(executionResult, equalTo(8));
    }

}