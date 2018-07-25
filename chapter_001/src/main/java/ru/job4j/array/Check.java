package ru.job4j.array;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Check {

    /**
     * @param data array that should be check
     * @return result of check
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == true) {
                count++;
            }
        }
        if (count == data.length || count == 0) {
            result = true;
        }
        return result;
    }
}
