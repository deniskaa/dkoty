package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.BubbleSort;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 @author deniskaa
 *@version 1.0
 *since 17.10.2017
 */

public class BubbleSortTest {

    // Тест метода BubbleSort.
    @Test
    public void WhenBubbleSortArrayThenTestPassed() {
        BubbleSort bSort = new BubbleSort();
        int[] nums = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bSort.sort(nums);
        int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }
}
