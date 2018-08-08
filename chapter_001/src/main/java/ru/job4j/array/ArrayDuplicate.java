package ru.job4j.array;

public class ArrayDuplicate {

    public String[] remove(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                continue;
            }

        }
        return array;
    }
}
