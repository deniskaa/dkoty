package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс удаляет повторяющееся элеметы в массиве.
 * @author deniskaa
 * @since 21.10.2017
 * @version 1.0
 */

public class ArrayDuplicate {

    //Метод находит и удаляет повторяющееся элементы.

    public String[] remove(String[] array) {
        int movedWords = 0;
        for(String word : array) {
            for(int count = 0; count < array.length - movedWords; count++) {
                if(word.equals(array[count]) && Arrays.asList(array).indexOf(word)!= count) {
                    moveElements(array, count);
                    movedWords++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - movedWords);
    }

    //Метод двигает элемент в край массива.

    public static String[] moveElements(String[] array, int firstElement) {
        for(int count = firstElement; count + 1 < array.length; count++) {
            String buffer = array[count];
            array[count] = array[count + 1];
            array[count + 1] = buffer;
        }return array;
    }
}
