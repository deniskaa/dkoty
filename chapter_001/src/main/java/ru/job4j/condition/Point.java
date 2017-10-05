package ru.job4j.condition;

/**
 * Класс шаблон объекта Point.
 * @author deniskaa
 * @since 05.10.2017
 * @version 1.0
 */

public class Point {
    private int x;
    private int y;

    /**
     * Метод сеттер.
     * @param x - первое число кординат.
     * @param y - вторая число кординат.
     */

    public void point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Метод геттер.
     * @return - возвращает x.
     */

    public  int getX() {
        return this.x;
    }

    /**
     * Метод геттер.
     * @return - возвращает y.
     */

    public int getY() {
        return this.y;
    }

    /**
     * Метод принимает параметры для функции и определяет принадлежность точки к данной функции.
     * @param a - первое число.
     * @param b - второе число.
     * @return - возвращает true если точка принадлежит функции и false если не пренадлежит.
     */

    public boolean is(int a, int b){
        return y == a * x + b;
    }

}