package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author deniskaa (koty.denis@gmail.com)
 *@version 1.0
 *since 05.10.2017
 */

public class PointTest {
    @Test
    public void whenPointOnLineThenTrue() {
        // Создаем объект Point.
        Point a = new Point();
        a.point(1, 9);
        // Выполняем метод - is и получаем результат.
        boolean rsl = a.is(5, 4);
        // Сравниваем результат с ожидаемым значениям.
        assertThat(rsl, is(true));
    }
}
