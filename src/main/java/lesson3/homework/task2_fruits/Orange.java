package lesson3.homework.task2_fruits;

/**
 * Orange extends Fruit.
 */
public class Orange extends Fruit {

    // вес апельсина по-умолчанию – 1.5f
    private static final float WEIGHT = 1.5f;

    // название фрукта (никак не используем)
    private static final String NAME = "Апельсин";

    public Orange(float weight) {
        super(NAME, weight);
    }

    // на случай, если мы не знаем вес конкретного апельсаина
    public Orange() {
        super(NAME, WEIGHT);
    }
}
