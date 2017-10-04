package ru.job4j.calculator;
/**
 *Класс выполняет простые арихметические задачи.
 * @author Deniskaa
 * @since 04.10.2017
 * @version 1.0
 */

public class Calculator {
    private double result;

    /**
     * Метод выполняет сложение.
     * @param first - первое число.
     * @param second - второе число.
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод выполняет вычисление.
     * @param first - первое число.
     * @param second - второе число.
     */

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод выполняет деление.
     * @param first - первое число.
     * @param second - второе число.
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод выполняет умножение.
     * @param first - первое число.
     * @param second - второе число.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Возвращает результат.
     * @return - результат вычислений.
     */
    public double getResult() {
        return this.result;
    }

}