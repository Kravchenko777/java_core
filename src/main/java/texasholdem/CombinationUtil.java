package texasholdem;

import texasholdem.enums.Combination;

import java.util.ArrayList;

public class CombinationUtil {

    public static Combination getCombination(ArrayList<Card> cards){


        return Combination.None;
    };

    private Boolean checkFlash(ArrayList<Card> cards){
        return true;
    }

    private Boolean checkStreet(ArrayList<Card> cards){
        return true;
    }
}
