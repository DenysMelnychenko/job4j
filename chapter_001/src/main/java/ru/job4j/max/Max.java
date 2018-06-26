package ru.job4j.max;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    /**
     * @param first  first number.
     * @param second second number.
     * @return max value between two numbers.
     */
    public int max(int first, int second) {
        return (first < second) ? second : first;
    }
}
