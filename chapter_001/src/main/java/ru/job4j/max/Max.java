package ru.job4j.max;

/**
 * Класс определяет максимальное число.
 * @author deniskaa
 * @since 04.10.2017
 * @version 1.0
 */
public class Max {

    /**
     * Метод определяет максимальное число из двух входящих значений.
     *
     * @param first  - первое число.
     * @param second - второе число.
     * @return - возвращает максимально высокое число .
     */

    public static int max(int first, int second) {
        return (first >= second ? first : second);
    }

    /**
     * Метод определяет максимальное число из трёх входящих значений.
     * @param first - первое число.
     * @param second - второе число.
     * @param third - третье число.
     * @return - результат вычислений.
     */

    public int maxThreeNum(int first, int second, int third) {
        return (max(max(first, second), third));
    }
}


