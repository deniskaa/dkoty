package ru.job4j.array;

/**
 * Класс проверяет наличее String в другом String;
 * @author deniskaa
 * @since 05.11.2017
 * @version 1.0
 */

public class CheckWord {

    /**
     * Метод сравнивает второй параметр с первым.
     * @param origin - слово которое хотим проверить.
     * @param sub - частица которую нужно найти.
     * @return - true если частица находится в слове.
     */

    boolean contains(String origin, String sub) {
        boolean result = false;
        String originLower = origin.toLowerCase();
        String subLower = sub.toLowerCase();
        char[] originArr = originLower.toCharArray();
        char[] subArr = subLower.toCharArray();
            for(int count = 0; count < originArr.length; count++) {
                if(originArr[count] == subArr[0]) {
                    for (int count2 = 1; count2 < subArr.length; count2++) {
                        if(originArr[count + count2] != subArr[count2]) {
                            count2 = subArr.length;
                        }else if(originArr[count + count2] == subArr[count2] && count2 == subArr.length - 1){
                            result = true;
                        }
                    }
                }
            }
        return result;
    }
}
