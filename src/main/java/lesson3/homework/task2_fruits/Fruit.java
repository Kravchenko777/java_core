package lesson3.homework.task2_fruits;

/**
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit.
 */
public abstract class Fruit {

    private final float weight;
    private final String name;

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruit(String name, float weight) {
        this.weight = weight;
        this.name = name;
    }

}
