package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author deniskaa
 *@version 1.0
 *since 10.10.2017
 */

public class CounterTest{
    /*
     * Test method add.
     */

    @Test
    public void ifResultThirtyThanTestPassed() {
        Counter cnt = new Counter();
        int result = cnt.add(1,10);
        int expect = 30;
        assertThat(result, is(expect));
    }
}
