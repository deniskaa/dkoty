package ru.job4j.loop;

/**
 * Класс рисует пирамиду из символов: ^ и пробела.
 * @author deniskaa
 * @since 15.10.2017
 * @version 1.0
 */

public class Paint {

    /**
     * Метод создает пирамиду из символов.
     * @param height - высота пирамиды.
     * @return - рисунок пирамиды.
     */

    public String piramid(int height) {
        StringBuilder result = new StringBuilder();
        for(int count = 0; count < height; count++){
            //pirSpace - определяет количество пробелов в рисунке.
            int pirSpace = height - count;
            // pirWidth - определяет ширину строки.
            int  pirWidth = height * 2;
            for(int countWidth = 1; countWidth < pirWidth ; countWidth++){
                if(countWidth >= pirSpace && countWidth <= pirWidth - pirSpace) {
                    result.append("^");
                }else{
                    result.append(" ");
                }
            }result.append(System.getProperty("line.separator"));
        }return result.toString();
    }
}

