package texasholdem;

import texasholdem.enums.Sex;

public class Human {

    private String fio;
    private Sex sex;

    public Human(String fio, Sex sex) {
        this.fio = fio;
        this.sex = sex;
    }

    public String getFio() {
        return fio;
    }

    public Sex getSex() {
        return sex;
    }
}
