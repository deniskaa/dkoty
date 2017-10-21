package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author deniskaa
 * @since 21.10.2017
 * @version 1.0
 */

public class ArrayDuplicateTest {

    // Тест метода remove.

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate(){
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] words = {"Sun", "People", "Sun", "World", "People","Star" };
        String[] result = duplicate.remove(words);
        String[] expected = {"Sun", "People", "World", "Star"};
        assertThat(result, is(expected));
    }
}
