package ru.job4j.array;

import org.junit.Test;
import ru.job4j.loop.Paint;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 @author deniskaa
 *@version 1.0
 *since 16.10.2017
 */

public class TurnTest {

    // Тест метода back с чётным количеством элементов.

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
            Turn Turn = new Turn();
            int[] nums = {4, 9, 1, 3};
            int[] result = Turn.back(nums);
            int[] expected = {3, 1, 9, 4};
            assertThat(result, is(expected));
    }

    // Тест метода back с нечётным количеством элементов.

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn Turn = new Turn();
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = Turn.back(nums);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}
