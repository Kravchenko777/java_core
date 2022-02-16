package lesson2.homework;

/**
 * При подаче массива размера, отличного от 4х4, необходимо бросить исключение MyArraySizeException.
 */
public class MyArraySizeException extends Exception {

    private final static byte SIZE = 4;

    public MyArraySizeException() {
        super("Ожидается массив размером " + SIZE + " на " + SIZE);
    }
}
