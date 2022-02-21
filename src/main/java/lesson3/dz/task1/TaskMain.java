package lesson3.dz.task1;

import java.util.Arrays;

public class TaskMain {

    static String[] arrayString = {"1", "2", "3", "4"};
    static Integer[] arrayInteger = {1, 2, 3};
    static Double[] arrayDouble = {1d, 2d, 3d, 4d};

    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayString, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayInteger, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayDouble, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }



    }


}
