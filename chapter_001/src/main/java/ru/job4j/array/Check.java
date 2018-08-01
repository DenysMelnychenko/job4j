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
        boolean resalt = true;
        boolean sample = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != sample) {
                resalt = false;
                break;
            }
        }
        return resalt;
    }
}
