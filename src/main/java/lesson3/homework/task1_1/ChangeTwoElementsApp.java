package lesson3.homework.task1_1;

import java.util.Arrays;

public class ChangeTwoElementsApp {
    /**
     * Задание №1 <p>
     * Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
     * @param array массив любого ссылочного типа
     * @param firstElementNum порядковый номер первого элемента
     * @param secondElementNum порядковый номер второго элемента
     * @param <T> любой ссылочный тип
     */
    private static <T> void changeTwoElements (T[] array, int firstElementNum, int secondElementNum) {

        T buffer = array[firstElementNum];
        array[firstElementNum] = array[secondElementNum];
        array[secondElementNum] = buffer;
        System.out.println("Поменяли местами элементы массива: " + array[secondElementNum] + " <-> " + array[firstElementNum]);
    }

    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"one", "two", "three", "four", "five"};
        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println(Arrays.toString(intArr));
        changeTwoElements(intArr, 0, 4);
        System.out.println(Arrays.toString(intArr));
        System.out.println();

        System.out.println(Arrays.toString(strArr));
        changeTwoElements(strArr, 1, 3);
        System.out.println(Arrays.toString(strArr));
        System.out.println();

        System.out.println(Arrays.toString(doubleArr));
        changeTwoElements(doubleArr, 4, 2);
        System.out.println(Arrays.toString(doubleArr));
        System.out.println();
    }

}
