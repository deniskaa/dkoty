package ru.job4j.array;

/**
 * Класс переворачивает массив задом наперёд.
 * @author deniskaa
 * @since 16.10.2017
 * @version 1.0
 */

public class Turn {

    /**
     * Принимает массив и переворачивает его.
     * @param array - массив.
     * @return - перевернутый массив.
     */

    public int[] back(int[] array) {
        int halfArray = array.length / 2;
        for(int count = 0; count < halfArray; count++ ){
            int buffer = 0;
            int mirrorNum = array.length - (count + 1);
            buffer = array[count];
            array[count] = array[mirrorNum];
            array[mirrorNum] = buffer;

        }return array;
    }
}
