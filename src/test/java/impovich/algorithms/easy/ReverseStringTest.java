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
public class ReverseStringTest {

    private static ReverseString reverseString;
    private static String input = "hello";
    private static String expected = "olleh";

    @BeforeClass
    public static void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        final String executionResult = reverseString.reverseString(input);
        stopwatch.stop();

        assertThat(executionResult, equalTo(expected));

        System.out.println("Time elapsed for reverseString(...) is "+ stopwatch.elapsed(NANOSECONDS));
    }

    @Test
    public void reverseStringRecursively() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        final String executionResult = reverseString.reverseStringRecursively(input);
        stopwatch.stop();

        assertThat(executionResult, equalTo(expected));

        System.out.println("Time elapsed for reverseStringRecursively(...) is "+ stopwatch.elapsed(NANOSECONDS));
    }

}