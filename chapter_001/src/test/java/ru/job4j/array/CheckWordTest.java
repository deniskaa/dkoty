package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author deniskaa
 * @since 05.11.2017
 * @version 1.0
 */


public class CheckWordTest {

    @Test
    public void whenThen(){
        CheckWord duplicate = new CheckWord();
        String originWord1 = "Sunny";
        String subWord2 = "sun";
        boolean result = duplicate.contains(originWord1, subWord2);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThen2(){
        CheckWord duplicate = new CheckWord();
        String originWord1 = "know";
        String subWord2 = "now";
        boolean result = duplicate.contains(originWord1, subWord2);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
