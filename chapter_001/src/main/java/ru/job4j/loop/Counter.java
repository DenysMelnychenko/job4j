package ru.job4j.loop;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    /**
     *
     * @param start the first number from the range
     * @param finish the last number from the range
     * @return summ of numbers from range that divide by 2
     */
    public int add(int start, int finish) {
        int summ = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                summ = summ + i;
            }
        }
        return summ;
    }
}
