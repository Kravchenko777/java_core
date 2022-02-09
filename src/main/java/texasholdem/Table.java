package texasholdem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Table {

    private ArrayList<Player> players;
    private ArrayList<Statistic> statistics = new ArrayList<>();
    private Integer blind;
    private Integer bigBlind;

    public Table(ArrayList<Player> players, Integer blind, Integer bigBlind){
        this.players = players;
        this.blind = blind;
        this.bigBlind = bigBlind;
    }

    public void initGame(Integer gameNumber){
        PlayingCards playingCards = new PlayingCards();
        Game game = new Game(players,playingCards,gameNumber);
        game.preFlop();
        game.flop();
        game.tern();
        game.river();
        finishGame(gameNumber,game.getWinner());
    }

    private void finishGame(Integer gameNumber, Player winner){

        statistics.add(new Statistic(winner, gameNumber));

        players = (ArrayList<Player>) players.stream().filter(player -> {
            return player.getPlayerBank()>0;
        }).collect(Collectors.toList());
    }

    public void getStatistic(){
        Map<Player, Long> result = statistics.stream()
                .collect(Collectors.groupingBy(Statistic::getWinPlayer, Collectors.counting()));
    }

    public Integer getPlayersInGame(){
        return players.size();
    }

    public Player getWinner(){
        if(players.size()==1) return players.get(0);
        else return null;
    }


}
