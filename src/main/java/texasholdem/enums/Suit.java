package texasholdem.enums;

public enum Suit {

    Spades("пики"),
    Clubs("трефы"),
    Hearts("черви"),
    Diamonds("бубны");

    private String title;
    Suit(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

}
