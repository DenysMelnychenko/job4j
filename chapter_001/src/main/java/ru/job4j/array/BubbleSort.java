package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int j) {
        int tmp;
        tmp = array[j - 1];
        array[j - 1] = array[j];
        array[j] = tmp;
    }
}
