package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
      return new int[]{0};
    }
}
