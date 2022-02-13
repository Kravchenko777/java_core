package lesson1.homework;

import java.util.ArrayList;

/**
 * Полоса препятствий
 * Храним название полосы препятствий и сам массив препятствий
 *
 * №3.
 * Добавить класс Course (полоса препятствий), в котором будут находиться:
 * массив препятствий;
 * метод, который будет просить команду пройти всю полосу.
 */
public class Course {

    // массив препятствий
    private final Obstacle[] obstacles;

    // название полосы препятствий
    private final String courseName;

    public Course(String courseName, Obstacle[] obstacles) {
        this.courseName = courseName;
        this.obstacles = obstacles;
    }

    /**
     * Просим команду пройти полосу препятствий.
     * @param team команда
     */
    public void passCourse (Team team) {
        System.out.println("Прохождение полосы препятствий: " + courseName);
        ArrayList<Player> passedPlayers = new ArrayList<>();
        for (Player player : team.getTeam()) {
            boolean isPlayerFailed = false;       // true - если игрок не прошел препятствие
            String obstacleName = null;                  // имя препятствия
            for (Obstacle obstacle : obstacles) {
                if (isPlayerFailed) break;        // если не пройдено препятствие, дальше полосу не проходим
                else {
                    if (!obstacle.isObstaclePassed(player)) {
                        obstacleName = obstacle.getObstacleName();
                        isPlayerFailed = true;
                    }
                }
            }
            if (isPlayerFailed) {
                System.out.println("Участник " + player.getName() + " не прошел " + obstacleName);
            } else {
                System.out.println("Участник " + player.getName() + " прошел всю полосу препятствий");
                passedPlayers.add(player);
            }
        }
        System.out.println();
        team.setPassedPlayers(passedPlayers.toArray(new Player[0]));
    }
}
