package lesson2.homework;

/**
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией,
 * в какой именно ячейке лежат неверные данные.
 */
public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message) {
        super(message);
    }
}
