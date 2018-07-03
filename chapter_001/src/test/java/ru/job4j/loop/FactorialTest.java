package ru.job4j.loop;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial factorial;

    @Before
    public void init() {
        factorial = new Factorial();
    }

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int expected = 120;
        int result = factorial.calc(5);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int result = factorial.calc(0);
        assertThat(result, is(expected));
    }
}


