package ru.job4j.loop;

/**
 * Класс высчитывае факториал.
 * @author deniskaa
 * @since 12.10.2017
 * @version 1.0
 */
public class Factorial {

    /**
     * Метод высчитывает факториал.
     * @param num - число для расчета факториала.
     * @return - факториал числа.
     */

    public int calc(int num){
        int result = 1;
        if(num != 0){
            for(int count = 1; count <= num; count++) {
                result = result * count;
            }
        }
        return result;
    }
}
