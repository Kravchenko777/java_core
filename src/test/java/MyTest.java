import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import texasholdem.Game;
import texasholdem.PlayingCards;

import java.util.Optional;

public class MyTest {

    @Test
    void testPlayingCards(){
        PlayingCards playingCards = new PlayingCards();
        Assertions.assertTrue(playingCards.checkCards());
        Assertions.assertEquals(52,playingCards.getSize());
        System.out.println(playingCards.toString());
    }

    @Test
    void testGetCard(){
        PlayingCards playingCards = new PlayingCards();
        System.out.println(playingCards.getCard().toString());
        Assertions.assertEquals(51,playingCards.getSize());

    }

    @Test
    void testGame(){
        PlayingCards playingCards = new PlayingCards();
        Game game = new Game(null, playingCards,0);
        game.flop();
        game.tern();
        game.river();
        game.showTable();
    }

    @Test
    void test(){
        String strnull = null;
        Optional<String> str = Optional.of(strnull);
        System.out.println(str.get());
    }


}
