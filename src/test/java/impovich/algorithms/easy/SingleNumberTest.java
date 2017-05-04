package impovich.algorithms.easy;

import com.google.common.base.Stopwatch;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class SingleNumberTest {

    private static SingleNumber singleNumber;
    private static int[] numbers = {12, 1, 2, 5, 2, 51, 1, 5, 6, 12, 6, 0, 15, 15, 0};

    @BeforeClass
    public static void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void singleNumber() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        final int executionResult = singleNumber.singleNumber(numbers);
        stopwatch.stop();

        assertThat(executionResult, equalTo(51));

        System.out.println("Time elapsed for singleNumber(...) is "+ stopwatch.elapsed(NANOSECONDS));

    }

    @Test
    public void singleNumberWithOutExtraMemory() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        final int executionResult = singleNumber.singleNumberWithOutExtraMemory(numbers);
        stopwatch.stop();

        assertThat(executionResult, equalTo(51));

        System.out.println("Time elapsed for singleNumberWithOutExtraMemory(...) is "+ stopwatch.elapsed(NANOSECONDS));
    }

}