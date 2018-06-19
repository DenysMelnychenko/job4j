package ru.job4j.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    public Calculator calc;

    @Before
    public void initalizeCalculator() {
       calc = new Calculator();
    }

    @Test
    public void whenAddOnePlusOneThenTwo() {
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractOneFromTenThenNine() {
        calc.subtract(10D, 1D);
        double result = calc.getResult();
        double expected = 9D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivideTenByTwoThenFive() {
        calc.divide(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTenByTwoThenTwenty() {
        calc.multiple(10D, 2D);
        double result = calc.getResult();
        double expected = 20D;
        assertThat(result, is(expected));
    }
}