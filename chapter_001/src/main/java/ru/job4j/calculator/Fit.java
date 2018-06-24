package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    private static final double DIFFERENCE_FOR_MAN = 100;
    private static final double DIFFERENCE_FOR_WEMAN = 110;

    private static final double FORMULA_INDEX = 1.15;

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - DIFFERENCE_FOR_MAN) * FORMULA_INDEX;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - DIFFERENCE_FOR_WEMAN) * FORMULA_INDEX;
    }
}
