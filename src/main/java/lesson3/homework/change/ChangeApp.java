package lesson3.homework.change;

import java.util.Arrays;

public class ChangeApp {

    public static void main(String[] args) {

        ArrayToChange<Integer> intArr = new ArrayToChange<>(1, 2, 3, 4, 5);
        intArr.printArray();
        intArr.changeElements(0, 4);
        intArr.printArray();
        System.out.println();

        ArrayToChange<String> strArr = new ArrayToChange<>("one", "two", "three", "four", "five");
        strArr.printArray();
        strArr.changeElements(1, 3);
        strArr.printArray();
        System.out.println();

        ArrayToChange<Double> doubleArr = new ArrayToChange<>(1.1, 2.2, 3.3, 4.4, 5.5);
        doubleArr.printArray();
        doubleArr.changeElements(2, 4);
        doubleArr.printArray();
    }
}
