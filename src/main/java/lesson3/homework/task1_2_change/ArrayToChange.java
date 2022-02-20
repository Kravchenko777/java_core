package lesson3.homework.task1_2_change;

import java.util.Arrays;

/**
 * Класс для хранения массива любого ссылочного типа
 * @param <T>
 */
public class ArrayToChange<T> {

    private final T[] array;

    public ArrayToChange(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(getArray()));
    }

    /**
     * Меняем местами два элемента массива
     * @param firstElement номер первого элемента массива
     * @param secondElement номер второго элемента массива
     */
    public void changeElements(int firstElement, int secondElement) {
        T buffer = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = buffer;
    }
}
