package lesson3.homework.task2_fruits;

import java.util.ArrayList;

public class BoxesApp {

    public static void main(String[] args) {

        // собираем урожай яблок с дерева №1
        ArrayList<Apple> apples1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            apples1.add(new Apple());
        }

        // собираем урожай яблок с дерева №2
        ArrayList<Apple> apples2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            apples2.add(new Apple());
        }

        // собираем урожай апельсинов
        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
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
        if (appleBox1.compare(appleBox2)) {
            System.out.println("Масса коробки с яблоками №1 и масса коробки с яблоками №2 равны");
        } else System.out.println("Массы коробок яблок №1 и №2 не равны");
        if (appleBox1.compare(orangeBox)) {
            System.out.println("Масса коробки с яблоками №1 и масса коробки с апельсинами равны");
        } else System.out.println("Массы коробок с яблоками и с апельсинами не равны");

        // пересыпаем фрукты из одной коробки в другую
        appleBox1.emptyBox(appleBox2);

    }
}
