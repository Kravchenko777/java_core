package texasholdem;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Game {

    private final ArrayList<Player> players;
    public ArrayList<Card> cardOnTable = new ArrayList<>();
    private PlayingCards playingCards;
    private Integer number;

    public Game(ArrayList<Player> players, PlayingCards playingCards,Integer number){
        this.players = players;
        this.playingCards = playingCards;
        this.number = number;
    }

    public void preFlop(){

        for(Player player: players){
            player.setHand(playingCards.getCard(),playingCards.getCard());
        }

    }

    public void flop(){
        cardOnTable.add(playingCards.getCard());
        cardOnTable.add(playingCards.getCard());
        cardOnTable.add(playingCards.getCard());
    }

    public void tern(){
        cardOnTable.add(playingCards.getCard());
    }

    public void river(){
        cardOnTable.add(playingCards.getCard());
    }

    public void showTable(){
        System.out.println(cardOnTable.stream().map(Card::toString).collect(Collectors.toList()).toString());
    }

    public Integer getNumber() {
        return number;
    }

    public Player getWinner(){
        return null;
    }
}
