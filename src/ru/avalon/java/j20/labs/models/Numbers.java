package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param <T> обобщенный тип
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static<T extends Number & Comparable> Double sum(T[] values) {
        Double sum = 0.0;
        for (int value = 0; value < values.length; value++) 
            sum = sum + values[value].doubleValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param <T> обобщенный тип
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <T extends Number & Comparable> double avg(T[] values) {
        return (double) sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param <T> обобщенный тип
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static<T extends Number & Comparable> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param <T>обобщенный тип
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static<T extends Number & Comparable> T max(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param <T>обобщенный тип
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static<T extends Number & Comparable> T min(T a, T b) {
        return a.compareTo(b)<= 0 ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param <T>обобщенный тип
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static<T extends Number & Comparable> T min(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}
