package lesson1;

import java.util.Objects;

public class Class_name_4 {

    private String value1;
    private Integer value2;

    public Class_name_4(){
        this.value1="Старое значение";
        this.value2=0;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Class_name_4{" +
                "value1='" + value1 + '\'' +
                ", value2=" + value2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class_name_4 that = (Class_name_4) o;
        return value1.equals(that.value1) && value2.equals(that.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
}
