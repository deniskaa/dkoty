package ru.job4j.loop;

/**
 * Класс рисует шахматную доску из символов: х и пробела.
 * @author deniskaa
 * @since 13.10.2017
 * @version 1.0
 */

public class Board {

    /**
     * Создаёт рисунок шахматной доски.
     * @param width - ширина доски.
     * @param height - высота доски.
     * @return - рисунок из символов.
     */

    public String paint(int width, int height) {
        StringBuilder result = new StringBuilder();
        for (int countHeight = 0; countHeight < height; countHeight++) {
            for (int countWidth = 0; countWidth < width; countWidth++) {
                if ((countHeight + countWidth) % 2 == 0) {
                    result.append("x");
                } else {
                    result.append(" ");
                }
            }
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }
}
