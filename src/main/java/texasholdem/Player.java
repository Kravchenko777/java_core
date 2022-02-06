package texasholdem;

import texasholdem.enums.Sex;

public class Player extends Human {

    private final String playerName;
    private Integer playerBank;
    private Boolean isDealer;


    public Player(String fio, Sex sex, String playerName,Integer playerBank) {
        super(fio, sex);
        this.playerName = playerName;
        this.playerBank = playerBank;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerBank(Integer playerBank) {
        this.playerBank = playerBank;
    }

    public Integer getPlayerBank() {
        return playerBank;
    }

    public Boolean getDiler() {
        return isDealer;
    }

    public void setDiler(Boolean diler) {
        isDealer = diler;
    }
}
