package lesson2.homework;

import java.util.Arrays;
import java.util.Random;

public class TwoDimArrayApp {

    private static final byte SIZE = 4;

    private static String sumArr(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        if (strArr.length != SIZE) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length != SIZE) throw new MyArraySizeException();
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException exception) {
                    // если наткнулись на невалидные данные, останавливаем подсчет элементов массива
                    // если еще раз использовать try..catch, то можно будет и выбросить наше исключение, и продолжить подсчет суммы
                    String message = "В ячейке [" + i + "][" + j + "] лежат неверные данные\n" + exception.getLocalizedMessage();
                    throw new MyArrayDataException(message);
                }
            }
        }
        return "Сумма элементов массива: " + sum;
}

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        // массивы для проверки метода sumArr
        byte NUMBER_OF_ARRAYS = 6;
        String[][][] arrays = new String[NUMBER_OF_ARRAYS][][];

        // должны выбросить MyArraySizeException
        arrays[0] = new String[SIZE - 1][SIZE];
        arrays[1] = new String[SIZE][SIZE + 1];
        arrays[2] = new String[][]{{"3", "232"}, {"1213", "222", "134"}};

        // должны выбросить MyArrayDataException
        arrays[3] = new String[SIZE][];
        arrays[3][0] = new String[]{"1", "2", "4.6f", "4"};
        arrays[3][1] = new String[]{"3}", "234", "2", "24"};
        arrays[3][2] = new String[]{"3", "text", "2", "24"};
        arrays[3][3] = new String[]{"", "234", "2", "#$"};

        arrays[4] = new String[SIZE][];
        arrays[4][0] = new String[]{"one", "two", "three", "four"};
        arrays[4][1] = new String[]{"один", "два", "три", "четыре"};
        arrays[4][2] = new String[]{"семнадцать", "тридвать два", "весна", "понедельник"};
        arrays[4][3] = new String[]{"cup", "of", "tea", "."};

        // должен отработать без исключений
        Random rnd = new Random();
        arrays[5] = new String[SIZE][SIZE];
        for (int i = 0; i < arrays[5].length; i++) {
            for (int j = 0; j < arrays[5][i].length; j++) {
                arrays[5][i][j] = String.valueOf(rnd.nextInt(101));
            }
        }

        // вывод
        System.out.println();
        for (String[][] array : arrays) {
            // печатаем входной массив в консоль
            for (String[] smallArray : array) {
                System.out.println(Arrays.toString(smallArray));
            }
            // отправляем на печать результат работы sumArr и отлавливаем исключения
            try {
                System.out.println(sumArr(array));
            } catch (MyArraySizeException | MyArrayDataException exception) {
                // пришлось закомментировать, иначе возникает проблема с выводом,
                // как будто выполяется в разных потоках вывод стэк трейса и вывод в консоль
                // exception.printStackTrace();
                System.out.print("Возникло исключение: ");
                System.out.println(exception.getClass());
                System.out.println(exception.getMessage());
                System.out.println(Arrays.toString(exception.getStackTrace()));
            } finally {
                System.out.println();
            }
        }
    }
}
