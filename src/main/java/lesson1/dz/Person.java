package lesson1.dz;

public class Person {

    private String name;
    private int canEatCalories;

    public Person(String name, int canEatCalories) {
        this.name = name;
        this.canEatCalories = canEatCalories;
    }

    public String getName() {
        return name;
    }

    public int getCanEatCalories() {
        return canEatCalories;
    }
}
