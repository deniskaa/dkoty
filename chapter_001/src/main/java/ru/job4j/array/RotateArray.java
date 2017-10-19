package ru.job4j.array;

/**
 * Класс поворачивает массив на 90 градусов по часовой стрелке.
 * @author deniskaa
 * @since 20.10.2017
 * @version 1.0
 */

public class RotateArray {

    // row - определяет начальный ряд.

    public int[][] rotate(int[][] array) {
        int row = 0;
        int width = array[row].length - 1;
        for (int position = 0; position < width; position++) {
            int buffer = array[row][position];
            array[row][position] = array[width - position][row];
            array[width - position][row] = array[width][width - position];
            array[width][width - position] = array[position][width];
            array[position][width] = buffer;
        }return array;
    }
}
