package texasholdem;

public interface PlayerInterface {

    public static final String fio ="";
    public static final String nickname ="";
    public Player player = null;

    public default void getBlind() {

    }

    public default void getBigBlind(){

    }

    public default void setPlayer(){

    }

    public default void setCards(){

    }

    public void preFlop();
    public void flop();
    public void tern();
    public void river();
}
