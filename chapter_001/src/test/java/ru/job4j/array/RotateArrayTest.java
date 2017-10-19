package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author deniskaa
 * @since 20.10.2017
 * @version 1.0
 */

public class RotateArrayTest {

    //Тест метода rotate, массив 2 на 2.

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rtArray = new RotateArray();
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = rtArray.rotate(nums);
        int[][] expected = {{3, 1}, {4, 2}};
        assertThat(result, is(expected));
    }

    //Тест метода rotate, массив 3 на 3.

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
      RotateArray rtArray = new RotateArray();
      int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] result = rtArray.rotate(nums);
      int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
      assertThat(result, is(expected));
    }
}
