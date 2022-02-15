package lesson1.homework;

/**
 * Класс "Препятствие"
 * Храним название препятствия и необходимые для его прохождения условия
 */
public class Obstacle {
    private final String obstacleName;  // название препятствия
    private final int strength; // сила от 0 до 100
    private final int agility;  // ловкость от 0 до 100
    private final int stamina;  // выносливость от 0 до 100

    public Obstacle(String obstacleName, int strength, int agility, int stamina) {
        this.obstacleName = obstacleName;
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
    }

    public String getObstacleName() {
        return obstacleName;
    }

    /**
     * Проверяем, пройдено ли испытание игроком
     * @param player игрок, проходящий испытание
     * @return true, если испытание пройдено
     */
    public boolean isObstaclePassed(Player player) {
        return isStrengthEnough(player) && isAgilityEnough(player) && isStaminaEnough(player);
    }

    private boolean isStrengthEnough(Player player) {
        return player.getStrength() >= strength;
    }

    private boolean isAgilityEnough(Player player) {
        return player.getAgility() >= agility;
    }

    private boolean isStaminaEnough(Player player) {
        return player.getStamina() >= stamina;
    }
}
