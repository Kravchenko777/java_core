package lesson3.homework.task2_fruits;

/**
 * Orange extends Fruit.
 */
public class Orange extends Fruit {

    // вес апельсина – 1.0f
    private static final float WEIGHT = 1.5f;

    // название фрукта
    private static final String NAME = "Апельсин";

    public Orange() {
        super(NAME, WEIGHT);
    }
}
