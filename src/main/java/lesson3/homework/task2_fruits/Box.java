package lesson3.homework.task2_fruits;

import java.util.ArrayList;

/**
 * Класс Box, в который можно складывать фрукты.
 * Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
 */
public class Box<T extends Fruit> {

    /**
     * Для хранения фруктов внутри коробки можно использовать ArrayList
     */
    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    /**
     * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество
     *
     * @return вес коробки
     */
    public float getWeight() {
        return T.getWeight() * fruits.size();
    }

    /**
     * Внутри класса Box сделать метод compare(),
     * который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
     * Можно сравнивать коробки с яблоками и апельсинами
     * Сравниваем с погрешностью 0.001
     *
     * @return true – если их массы равны, false в противоположном случае.
     */
    public boolean compare(Box<? extends Fruit> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.001;
    }

    /**
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой.
     * Нельзя яблоки высыпать в коробку с апельсинами.
     *
     * @param anotherBox другая коробка
     */
    public void emptyBox(Box<T> anotherBox) {
        for (T fruit : this.fruits) {
            anotherBox.addFruit(fruit);
        }
        this.fruits.clear();
    }

    /**
     * Не забываем про метод добавления фрукта в коробку.
     *
     * @param fruit фрукт
     */
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

}
