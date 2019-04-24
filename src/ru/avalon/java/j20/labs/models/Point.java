package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 * @param <T>Обобщенный тип
 */
public class Point<T extends Number> {
    /**
     * Абсцисса точки.
     */
    private final T x;
    /**
     * Ордината точки.
     */
    private final T y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public T getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public T getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public Double distanceTo(Point point) {
        Double dx = x.doubleValue() - point.x.doubleValue();
        Double dy = y.doubleValue() - point.y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
