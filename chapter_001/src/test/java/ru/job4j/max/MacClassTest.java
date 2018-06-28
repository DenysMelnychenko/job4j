package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MacClassTest {
    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maximum = new Max();
        int result = maximum.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenThirdTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(2, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenThecondTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(2, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(7, 4, 5);
        assertThat(result, is(7));
    }
}
