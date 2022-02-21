package lesson4.compare;

public class Deposit implements Comparable {
    private String name;
    private int value;

    public Deposit(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Deposit another = (Deposit)o;
        if (this.value > another.value) {
            return 1;
        }
        if (this.value < another.value) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Deposit [" + name + "]";
    }
}