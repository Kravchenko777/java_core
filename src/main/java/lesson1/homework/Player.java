package lesson1.homework;

/**
 * Класс "Игрок"
 * Храним имя игрока и его характеристики
 */
public class Player {
    private final String name;  // имя участника
    private final int strength; // сила от 0 до 100
    private final int agility;  // ловкость от 0 до 100
    private final int stamina;  // выносливость от 0 до 100

    public Player(String name, int strength, int agility, int stamina) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Участник: " + name + "\n" +
                "Сила: " + strength + "\n" +
                "Ловкость: " + agility + "\n" +
                "Выносливость: " + stamina + "\n";
    }

    /**
     * Выводим информацию об игроке
     */
    public void playerInfo() {
        System.out.println(this);
    }
}
