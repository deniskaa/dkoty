package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
        Max maxim = new Max();
        int result = maxim.max(5, 8);
        assertThat(result, is(8));
    }
}
