package texasholdem.enums;

public enum Combination {

    None(1),
    Pair(2),
    TwoPair(3),
    Three(4),
    Street(5),
    Flash(6),
    FullHouse(7),
    Fore(8),
    StreetFlash(9);

    private Integer title;
    Combination(Integer title){
        this.title = title;
    }

    public Integer getTitle(){
        return this.title;
    }
}
