package lesson3.homework.task2_fruits;

/**
 * Apple extends Fruit.
 */
public class Apple extends Fruit {

    // вес яблока по-умолчанию – 1.0f
    private static final float WEIGHT = 1.0f;

    // название фрукта (никак не используем)
    private static final String NAME = "Яблоко";

    public Apple(float weight) {
        super(NAME, weight);
    }

    // на случай, если мы не знаем веса конкретного яблока
    public Apple() {
        super(NAME, WEIGHT);
    }
}
