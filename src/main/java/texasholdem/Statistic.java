package texasholdem;

public class Statistic {

    private Player winPlayer;
    private Integer gameNumber;

    public Player getWinPlayer() {
        return winPlayer;
    }

    public Integer getGameNumber() {
        return gameNumber;
    }

    public Statistic(Player winPlayer, Integer gameNumber) {
        this.winPlayer = winPlayer;
        this.gameNumber = gameNumber;
    }
}
