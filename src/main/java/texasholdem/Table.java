package texasholdem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Table {

    private ArrayList<Player> players;
    private ArrayList<Statistic> statistics = new ArrayList<>();

    public void initGame(Integer gameNumber){

    }

    private void finishGame(Integer gameNumber, Player winner){
        statistics.add(new Statistic(winner, gameNumber));
    }

    public void getStatistic(){
        Map<Player, Long> result = statistics.stream()
                .collect(Collectors.groupingBy(Statistic::getWinPlayer, Collectors.counting()));
    }
}
