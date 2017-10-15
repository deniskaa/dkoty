package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 @author deniskaa
 *@version 1.0
 *since 15.10.2017
 */

public class PaintTest {

    // Тест метода piramid с высотой 3.

    @Test
    public void WhenPiramidWithHeightThreeThenHerBaseIsFive() {
        Paint Paint = new Paint();
        String result = Paint.piramid(3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line, line);
        assertThat(result, is(expected));
    }

    //Тест метода piramid с высотой 5.

    @Test
    public void WhenPiramidWithHeightFiveThenHerBaseIsNine() {
        Paint Paint = new Paint();
        String result = Paint.piramid(5);
        final String line = System.getProperty("line.separator");
        String expected = String.format("    ^    %s   ^^^   %s  ^^^^^  %s ^^^^^^^ %s^^^^^^^^^%s", line, line, line, line, line, line);
        assertThat(result, is(expected));
    }
}
