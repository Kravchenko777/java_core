package lesson4.compare;

public class Deposit_ {
    private String name;
    private int value;

    public Deposit_(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Deposit [" + name + "]";
    }

    public int getValue() {
        return value;
    }
}
