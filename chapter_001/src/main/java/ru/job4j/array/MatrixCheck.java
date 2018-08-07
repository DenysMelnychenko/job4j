package ru.job4j.array;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {

    /**
     * @param data array that will checked
     * @return result of checking
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {

            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
            }
        }
        return result;
    }
}