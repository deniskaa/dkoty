package ru.job4j.condition;

/**
 * Класс описывает треугольник и расчитывает его площадь.
 * @author deniskaa
 * @since 08.10.17
 * @version 1.o
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * Метод сеттер.
     * @param a - первая точка.
     * @param b - вторая точка.
     * @param c - третья точка.
     */

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод расчитывает расстояние между точками.
     * @param left - левая точка.
     * @param right - правая точка.
     * @return - возвращает расстояние между ними.
     */

    public double distance(Point left, Point right) {
        return Math.sqrt( Math.pow((right.getX() - left.getX()), 2 )  + Math.pow((right.getY() - left.getY()), 2 ));

    }

    /**
     * Метод высчитывает периметр триугольника.
     * @param ab -  расстояние между точками a b.
     * @param ac -  расстояние между точками a с.
     * @param bc -  расстояние между точками b c.
     * @return - Периметр.
     */

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод определяет возможность создания триугольника с данными сторонами.
     * @param ab - первая сторона.
     * @param ac - вторая сторона.
     * @param bc - третья сторона.
     * @return - возвращает true если триугольник существует и false если нет.
     */

    private boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && bc + ab > ac;
    }

    /**
     * Метод высчитывает площадь триугольника.
     * @return - возвращает результат расчетов.
     */

    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt( p *(p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

}

