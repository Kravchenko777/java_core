package texasholdem;

import texasholdem.enums.Sex;

import java.util.ArrayList;

public class Player extends Human {

    private final String playerName;
    private Integer playerBank;
    private Boolean isDealer;
    private ArrayList<Card> hand = new ArrayList<>();


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

    public void setHand(Card first, Card second){
        hand.clear();
        hand.add(first);
        hand.add(second);
    }
    /**
    * possible public in Table class:
     * int numberPlayersOnTable,int bigBlind
     *
     * need input logArrayAllGame.add(actionOnTableOneGame) as public Table metod
     */
    public int movePockerChips (ArrayList<Card> cardOnTable,ArrayList<> actionOnTable,int myNumberPlaceOnTable, int numberPlayersOnTable,int bigBlind)
        int  chipsForMove=(int)bigBlind*4Math.random();
      //  int myBankroll; if (myBankrol-chipsForMove<0) {chipsForMove=myBankRoll;}
    return chipsForMove;// if return = 0 then fold or check


}
