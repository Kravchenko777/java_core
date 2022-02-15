package lesson1.homework;

import java.util.Random;

public class GamesApp {

    // массив имен
    private static final String[] NAMES = {"Иван", "Василий", "Петр", "Сергей", "Антон", "Тихон", "Спиридон", "Афанасий", "Георгий", "Богдан"};
    // массив фамилий
    private static final String[] SURNAMES = {"Новосельцев", "Иванов", "Петров", "Сидоров", "Жданов", "Лебедев", "Кулыванов", "Трапорян"};

    // число участников в команде
    private static final byte TEAM_SIZE = 4;

    /**
     * Возвращаем полное имя игрока.
     * @param names массив имен
     * @param surnames массив фамилий
     * @return полное имя
     */
    private static String getFullName(String[] names, String[] surnames) {
        Random rnd = new Random();
        return surnames[rnd.nextInt(surnames.length)] + " " + names[rnd.nextInt(names.length)];
    }

    /**
     * Создаем команду.
     * Участники и их параметры генерируются случайно.
     * @param teamName название команды
     * @return новая команда
     */
    private static Team createTeam(String teamName) {
        Random rnd = new Random();
        Player[] players = new Player[TEAM_SIZE];
        for (int playerIndex = 0; playerIndex < TEAM_SIZE; playerIndex++) {
            players[playerIndex] = new Player(getFullName(NAMES, SURNAMES), rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101));
        }
        return new Team(teamName, players);
    }

    /**
     * Создаем полосу препятствий.
     * @param courseName название полосы препятствий
     * @return новая полоса препятствий
     */
    private static Course createCourse(String courseName) {
        Obstacle[] obstacles = new Obstacle[5];
        obstacles[0] = new Obstacle("Плавание", 10, 20, 25);
        obstacles[1] = new Obstacle("Бег", 10, 5, 25);
        obstacles[2] = new Obstacle("Велосипед", 20, 20, 20);
        obstacles[3] = new Obstacle("Скалолазание", 35, 35, 35);
        obstacles[4] = new Obstacle("Фехтование", 10, 50, 20);
        return new Course(courseName, obstacles);
    }

    public static void main(String[] args) {
        // создаем команду
        Team team = createTeam("Могучие утята");

        // создаем полосу препятствий
        Course course = createCourse("Гонка на выбывание");

        // выводим информацию о всей команде
        team.showTeam();

        // просим команду пройти всю полосу
        course.passCourse(team);

        // выводи информацию о членах команды, прошедших дистанцию
        team.showResults();
    }
}
