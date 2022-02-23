package lesson5;

import java.io.Serializable;

public class RawClass implements Serializable {

    private String name;
    private Integer first;
    private Integer end;
    private transient Boolean bool;

    public RawClass(String name, Integer first, Integer end, Boolean bool) {
        this.name = name;
        this.first = first;
        this.end = end;
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "RawClass{" +
                "name='" + name + '\'' +
                ", first=" + first +
                ", end=" + end +
                ", bool=" + bool +
                '}';
    }
}
