package impovich.algorithms.easy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * @author Alexander Hamza
 *         created 04/05/2017
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        final List<String> executionResult = fizzBuzz.fizzBuzz(15);

        assertThat(executionResult,
                contains("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
    }

}