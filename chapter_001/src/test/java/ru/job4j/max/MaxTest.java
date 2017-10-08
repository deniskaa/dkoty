package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.max.Max.max;

/**
 * Test
 *
 * @author deniskaa
 * @version 1.0
 * @since 04.10.2017
 */

public class MaxTest {

    /**
     * Test max.
     */

    @Test
    public void whenFirstLessSecond() {
        int result = max(5, 8);
        assertThat(result, is(8));
    }

    /**
     *Test maxThreeNum.
     */

    @Test
    public void whenThirdBiggerThenLastTwo() {
        Max max = new Max();
        int result = max.maxThreeNum(3, 5, 10);
        assertThat(result, is(10));
    }
}

