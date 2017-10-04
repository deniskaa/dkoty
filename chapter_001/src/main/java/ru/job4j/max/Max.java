package ru.job4j.max;

/**
 * Класс определяет максимальное число.
 * @author deniskaa
 * @since 04.10.2017
 * @version 1.0
 */
public class Max {

    /**
     * Метод определяет максимальное число.
     * @param first - первое число.
     * @param second - второе число.
     * @return - возвращает максимально высокое число .
     */

    public int max(int first, int second) {
        return( first >= second ? first : second);
    }
}
