package texasholdem;

import java.util.ArrayList;

/**
 * Сервер для игры в Техасский Холдем
 * https://ru.wikihow.com/%D0%B8%D0%B3%D1%80%D0%B0%D1%82%D1%8C-%D0%B2-%D1%82%D0%B5%D1%85%D0%B0%D1%81%D1%81%D0%BA%D0%B8%D0%B9-%D1%85%D0%BE%D0%BB%D0%B4%D0%B5%D0%BC-%D0%BF%D0%BE%D0%BA%D0%B5%D1%80
 */
public class Server {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Integer initSumm = 1000;
        Table table = new Table(players,5,10);
        int gameNumber = 0;
        while (table.getPlayersInGame()>1){
            gameNumber++;
            table.initGame(gameNumber);
        }
        table.getStatistic();
        table.getWinner();
    }
}
