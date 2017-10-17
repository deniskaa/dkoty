package ru.job4j.array;

/**
 * Класс для сортировки массивов.
 * @author deniskaa
 * @since 17.10.2017
 * @version 1.0
 */

public class BubbleSort {

    /**
     * Метод выполняет сортировку пузырьком.
     * @param array - сортируемый массив.
     * @return - отсортированный массив.
     */

    public int[] sort(int[] array) {
        // end - определяет количество циклов во внутренем цикле.
        for(int position = 0, end = array.length ; position < array.length; position++ ) {
            for(int i = 1; i < end; i++) {
                if (array[i - 1] > array[i]) {
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                }
            }end--;
        }
        return array;
    }

}
