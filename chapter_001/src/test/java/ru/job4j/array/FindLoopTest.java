package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {

    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength121ThenMinusOne() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3, 95};
        int value = 121;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}