package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author deniskaa (koty.denis@gmail.com)
 *@version 1.0
 *since 29.09.2017
 */

public class FactorialTest {

    // Тест calc, параметр num равен 5.

    @Test
    public void WhenFactorialIsOneHudredTwentyThenTrue() {
        Factorial fctr = new Factorial();
        int result = fctr.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    // Тест calc, параметр num равен 0.

    @Test
    public void WhenThenFactorialIsOneThenTrue() {
        Factorial fctr = new Factorial();
        int result = fctr.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
