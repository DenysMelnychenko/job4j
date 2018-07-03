package ru.job4j.loop;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     *
     * @param n number to calculate factorial.
     * @return factorial value.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
