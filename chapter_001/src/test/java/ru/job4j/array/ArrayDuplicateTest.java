package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate example = new ArrayDuplicate();
        String[] result = example.remove(new String[]{"Good", "Good", "Night", "Night", "Night"});
        assertThat(result, is(new String[]{"Good", "Night"}));

    }
}
