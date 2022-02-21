package lesson3.homework.task2_fruits;

/**
 * Apple extends Fruit.
 */
public class Apple extends Fruit {

    // вес яблока – 1.0f
    private static final float WEIGHT = 1.0f;

    // название фрукта
    private static final String NAME = "Яблоко";

    public Apple() {
        super(NAME, WEIGHT);
    }
}
