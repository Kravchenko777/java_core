package lesson3.homework.task2_fruits;

import java.util.ArrayList;

public class BoxesApp {

    static final float APPLE_WEIGHT = 1.0f;
    static final float ORANGE_WEIGHT = 1.5f;

    public static void main(String[] args) {

        // собираем урожай яблок с дерева №1
        // мы знаем вес каждого яблока
        ArrayList<Apple> apples1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            apples1.add(new Apple());
        }

        // собираем урожай яблок с дерева №2
        // мы не знаем вес каждого яблока, поэтому используем вес по-умолчанию
        ArrayList<Apple> apples2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            apples2.add(new Apple(APPLE_WEIGHT));
        }

        // собираем урожай апельсинов
        // мы знаем вес каждого апельсина
        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange(ORANGE_WEIGHT));
        }

        // кладем яблоки в коробку №1
        Box<Apple> appleBox1 = new Box<>(apples1);

        // кладем яблоки в коробку №2
        Box<Apple> appleBox2 = new Box<>(apples2);

        // кладем апельсины в коробку
        Box<Orange> orangeBox = new Box<>(oranges);

        // сравниваем коробки
        System.out.println("Масса коробки с яблоками №1: " + appleBox1.getWeight());
        System.out.println("Масса коробки с яблоками №2: " + appleBox2.getWeight());
        System.out.println("Масса коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println();

        if (appleBox1.compare(appleBox2)) {
            System.out.println("Масса коробки с яблоками №1 и масса коробки с яблоками №2 равны");
        } else System.out.println("Масса коробки с яблоками №1 и масса коробки с яблоками №2 не равны");
        if (appleBox1.compare(orangeBox)) {
            System.out.println("Масса коробки с яблоками №1 и масса коробки с апельсинами равны");
        } else System.out.println("Массы коробки с яблоками №1 и масска коробки с апельсинами не равны");
        if (appleBox2.compare(orangeBox)) {
            System.out.println("Масса коробки с яблоками №2 и масса коробки с апельсинами равны");
        } else System.out.println("Масса коробки с яблоками №2  и масса коробки с апельсинами не равны");
        System.out.println();

        // пересыпаем фрукты из одной коробки в другую
        appleBox1.emptyBox(appleBox2);
        System.out.println("Масса коробок после пересыпания");
        System.out.println("Масса коробки с яблоками №1: " + appleBox1.getWeight());
        System.out.println("Масса коробки с яблоками №2: " + appleBox2.getWeight());

    }
}
