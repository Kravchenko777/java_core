package lesson1.homework;

/**
 * №2
 * Добавить класс Team, который будет содержать:
 * название команды;
 * массив из четырех участников — в конструкторе можно сразу всех участников указывать);
 * метод для вывода информации о членах команды, прошедших дистанцию;
 * метод вывода информации обо всех членах команды.
 */
public class Team {

    // число участников в команде
    private static final byte TEAM_SIZE = 4;

    // массив команды из четырех участников
    private Player[] team;

    // массив участников, прошедших полосу препятствий
    private Player[] passedPlayers;

    // название команды
    private final String teamName;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        // в команде должно быть только 4 участника
        if (players.length == TEAM_SIZE) {
            this.team = players;
        } else {
            System.out.println("В команде должно быть только 4 участника");
        }
    }

    /**
     * Выводим информацию о всех членах команды
     */
    public void showTeam() {
        System.out.println("Команда: " + getTeamName());
        printInfo(getTeam());
    }

    /**
     * Выводим информацию о членах команды, прошедших дистанцию, если такие есть
     */
    public void showResults() {
        if (getPassedPlayers().length != 0) {
            System.out.println("Участники, прошедшие дистанцию");
            printInfo(getPassedPlayers());
        } else System.out.println("Ни один участник не прошел дистанцию");
    }

    /**
     * Метод для вывода результатов
     * @param players массив участников для печати
     */
    private void printInfo(Player[] players) {
        for (Player player : players) {
            player.playerInfo();
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getTeam() {
        return team;
    }

    public Player[] getPassedPlayers() {
        return passedPlayers;
    }

    public void setPassedPlayers(Player[] passedTeam) {
        this.passedPlayers = passedTeam;
    }
}
