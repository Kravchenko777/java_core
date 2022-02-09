package texasholdem.enums;

public enum Value {

    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack (11),
    Queen (12),
    King(13),
    Ace(14);

    private Integer title;
    Value(Integer title){
        this.title = title;
    }

    public Integer getTitle(){
        return this.title;
    }
}
