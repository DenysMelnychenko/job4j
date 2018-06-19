package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Denis Melnichenko
 * @version $Id$
 */

public class Calculator {
    private double result;

    /**
     * Method add
     *
     * @param first  first number.
     * @param second second number.
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method getResult
     *
     * @return result of added.
     */

    public double getResult() {
        return this.result;
    }

    /**
     * Method substract
     *
     * @param first  first number.
     * @param second second number.
     */

    public void subtract(double first, double second) {

        this.result = first - second;
    }

    /**
     * Method divide
     *
     * @param first  first number.
     * @param second second number.
     */

    public void divide(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple
     *
     * @param first  first number.
     * @param second second number.
     */

    public void multiple(double first, double second) {
        this.result = first * second;
    }
}
