package texasholdem;

import texasholdem.enums.Suit;
import texasholdem.enums.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class PlayingCards {

    ArrayList<Card> arrayList = new ArrayList<>();

    public PlayingCards(){
        for(Suit suit: Suit.values()){
            for (Value value: Value.values()){
                arrayList.add(new Card(suit,value));
            }
        }
        Collections.shuffle(arrayList);

    }

    public Boolean checkCards(){
        return arrayList.size() == Suit.values().length* Value.values().length;
    }

    @Override
    public String toString() {

        return arrayList.stream().map(Card::toString).collect(Collectors.toList()).toString();
    }

    public int getSize(){
        return arrayList.size();
    }

    public Card getCard(){
        Card result = arrayList.get(0);
        arrayList.remove(0);
        return result;
    }


}
