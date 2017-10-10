package ru.job4j.loop;

/**
 * Класс висчитывает сумму чётных чисел в заданном диапазоне.
 * @author deniskaa.
 * @since 10.10.2017
 * @version 1.0
 */

public class Counter {

    /**
     * Метод высчитывает сумму чётных чисел.
     * @param start - начало диапазона.
     * @param finish - конец диапазона.
     * @return - сумму четных чисел.
     */

    public int add(int start, int finish) {
        int rsl = 0;
        while(start <= finish) {
            if(start % 2 == 0) {
                rsl =+ start;
            }
            start++;
        }
        return rsl;
    }
}
