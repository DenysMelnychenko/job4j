package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    int duplicate = 0;

    public String[] remove(String[] array) {
        for (int i = 0; i < array.length - duplicate; i++) {
            for (int j = i + 1; j < array.length - duplicate; j++) {
                if (array[i].equals(array[j])) {
                    duplicate++;
                    while (!array[i].equals(array[j - duplicate])) {
                        swapWithLast(array, j);
                    }
                }
            }
        }
        return Arrays.copyOf(array, array.length - duplicate);
    }

    private void swapWithLast(String[] array, int index) {
        String tmp;
        tmp = array[array.length - duplicate];
        array[array.length - duplicate] = array[index];
        array[index] = tmp;
    }
}
